# 🛒 Platzi Market API

🔹 **Descripción**: API RESTful desarrollada en **Java + Spring Boot** para gestión de productos en una tienda virtual. Incluye operaciones CRUD, seguridad básica y documentación automatizada con **ApiDocs**.

[![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=java)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0-brightgreen?logo=spring)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-blue)](https://opensource.org/licenses/MIT)

## 🚀 Características
- CRUD de productos y categorías.
- Autenticación JWT (opcional, si aplica).
- Base de datos: **PostgreSQL**.
- Documentación interactiva con **ApiDocs** (Swagger/OpenAPI).

## 🛠 Tecnologías
| Herramienta       | Uso                              |  
|-------------------|----------------------------------|  
| Java 17+         | Lenguaje principal.              |  
| Spring Boot      | Framework backend.               |  
| Spring JPA       | Persistencia de datos.           |  
| PostgreSQL       | Base de datos relacional.        |  
| ApiDocs          | Documentación automática.        |  

## ⚙️ Instalación y Uso

1. **Descargar postgres y correr los script en la carpeta scriptsBD/**
2. **Descarjar el jar y ejecutar platzi-market-api.jar**
   ```bash  
   java -jar market-project-1.0.jar
3. **Por defecto se ejecuta en el perfil de dev, para alternar entre perfiles se agrega el argumento: **
   ```bash
   ##pdn para prod
   ##dev para desarrollo
   java -jar -Dspring.profiles.active=pdn market-project-1.0.jar

## Notas:
*Por defecto el puerto configurado es el 7021 para dev y 8090 para prod.* 

*Las contraseñas por para la base por defecto son usuario: admin y contraseña: password*

## ✉️ Contacto
$ Autor: Jhosbyn Daniel $ 

$Email: jhosbyndaniel@gmail.com$

$GitHub: @PatchWtf$



## 🕹️ Easter Egg
¿Eres curioso? ¡Mira el código fuente de este README! 🎮
<!--
  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  
  ⠀⠀⠀⠀⠀⠀⢀⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣤⡀⠀⠀⠀⠀⠀⠀  
  ⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀  
  ⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀  
  ⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿🟡⣿🟡⣿⣿⣿⣿⣿⣿⣿⣆⠀  
  ⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄  
  ⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿  
 ⠀⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛ 
  𝗖𝗼𝗺𝗲 𝗹𝗼𝘀 𝗯𝘂𝗴𝘀 𝗰𝗼𝗺𝗼 𝗣𝗮𝗰-𝗠𝗮𝗻 𝗰𝗼𝗺𝗲 𝗳𝗿𝗻𝘁𝗮𝘀𝗺𝗮𝘀 👾  
-->