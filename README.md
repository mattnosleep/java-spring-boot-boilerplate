# Spring Boot Boilerplate

## Getting Started

### Requirements

* Install [Docker desktop](https://www.docker.com/products/docker-desktop/)

### Setup
1. Start postgres container
   * `cd dev`
   * `docker-compose up -d`
2. Start application
   * `./gradlew bootRun`

### API Documentation
Once the application is running, you can access:
- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI documentation: http://localhost:8080/api-docs
