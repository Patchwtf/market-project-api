package com.platzi.market_project.persistence;

import com.platzi.market_project.domain.Purchase;
import com.platzi.market_project.domain.repository.PurchaseRepository;
import com.platzi.market_project.persistence.crud.CompraCrudRepository;
import com.platzi.market_project.persistence.entity.Compra;
import com.platzi.market_project.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;
    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
                .map(puraches -> mapper.toPurchases(puraches));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(comprasProducto -> comprasProducto.setCompra(compra));
        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}
