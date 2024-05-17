# BOGO Application

## Description
This is a Spring Boot application that implements a "Buy One Get One Free" (BOGO) offer. Customers can buy one product and get another product for free as long as the price of the product is equal to or less than the price of the first product.

## Requirements
- Java 11
- Maven

## Setup
1. Clone the repository:
    ```sh
    git clone https://github.com/your-repo/bogo-application.git
    cd bogo-application
    ```

2. Build the project:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

## API Endpoints
- `POST /bogo/apply`: Apply the BOGO offer to a list of products.

## Example Request
```sh
curl -X POST http://localhost:8080/bogo/apply -H "Content-Type: application/json" -d '[{"price":10},{"price":20},{"price":30},{"price":40},{"price":50},{"price":60}]'
```

## Testing
Run the tests using:
```sh
mvn test
```

## Deployment
1. Build the project:
    ```sh
    mvn clean package
    ```

2. Run the JAR file:
    ```sh
    java -jar target/bogo-application-1.0.0.jar
    ```

## License
This project is licensed under the MIT License.