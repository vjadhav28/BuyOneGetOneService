# BOGO Application

## Description
This is a Spring Boot application that implements a "Buy One Get One Free" (BOGO) offer. Customers can buy one product and get another product for free as long as the price of the product is equal to or less than the price of the first product.

## Requirements
- Java 11
- Maven

## Setup
1. Clone the repository:
    ```sh
    git clone https://github.com/vjadhav28/BuyOneGetOneService.git
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
To use the BOGO offer API endpoints in your Spring Boot application, you need to pass the product price list as a request parameter in the URL. The URL format for each endpoint is as follows:

/api/bogo/offer:
URL: http://localhost:8080/api/bogo/offer?productPriceList=10,20,30,40,50,60
Example request: http://localhost:8080/api/bogo/offer?productPriceList=10,20,30,40,50,60
2.
/api/bogo/offer2:
URL: http://localhost:8080/api/bogo/offer2?productPriceList=10,20,30,40,50,50,60,60
Example request: http://localhost:8080/api/bogo/offer2?productPriceList=10,20,30,40,50,50,60,60
3.
/api/bogo/offer3:
URL: http://localhost:8080/api/bogo/offer3?productPriceList=10,20,30,40,50,50,50,60,60
Example request: http://localhost:8080/api/bogo/offer3?productPriceList=10,20,30,40,50,50,50,60,60
