# Belajar Microservice

### Tech Stack Yang Digunakan
 * Spring Boot
 * Spring Cloud
 * MongoDB
 * MySQL
 * Docker
 * Keycloak
 * Kafka

#### Menampilkan daftar kontainer Docker yang sedang berjalan pada sistem. 
    docker ps

#### Start Keycloack
    docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:21.0.1 start-dev
Setting port keycloak ke port lain kecuali port (8080, 8081, 8761) karena telah digunakan oleh service lain

#### Configure Token di PostMan
> Token Name : token
> 
> Grant Type : Client Credentials
> 
> Access Token URL : http://localhost:8181/realms/spring-boot-microservices-realm/protocol/openid-connect/token
> 
> Client ID : spring-cloud-client
> 
> Client Secret : buka keycloack -> Clients -> Credentials -> copy Client Secret
> 
> Scope : openid offline_access
> 
> Client Authentication : Send as Basic Auth header
