# API REST - Cliente Service

Este es un servicio REST desarrollado con **Spring Boot** que permite obtener la información de un cliente a través de una consulta basada en su **documento de identidad** y **tipo de documento**. La aplicación está construida utilizando **Java 17** y **Maven**.

## Requisitos

- **Java 17** o superior
- **Maven 3.6.3** o superior

## Descripción

La API expone un único endpoint para obtener la información de un cliente. Este endpoint acepta una solicitud `GET` con los parámetros `documento` y `tipoDocumento`, y devuelve la información del cliente correspondiente.

### Endpoint

- **URL Base**: `http://localhost:8090`

### Método: `GET`

#### Endpoint: `Consultar cliente`

- **Descripción**: Obtiene la información de un cliente según el número de documento y el tipo de documento.
- **URL**: `/api/v1/clients/search`
- **Parámetros (Request Body)**:
    - `document`: El número del documento del cliente (obligatorio).
    - `typeDocument`: El tipo de documento (obligatorio). Ejemplo: "DNI", "RUC", etc.


## Swagger
#### URL Swagger: `/swagger-ui/index.html`