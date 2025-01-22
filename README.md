# Microservice Architecture with Spring Boot

This project demonstrates a basic microservice architecture using Spring Boot. It includes multiple microservices, each with its own responsibility, and showcases inter-service communication using RESTful APIs.

## Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Architecture](#architecture)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Microservices are an architectural style that structures an application as a collection of loosely coupled services. Each service is independent, allowing for scalability and maintainability. This project is a simple implementation of microservices using Spring Boot.

## Technologies Used

- Java 17
- Spring Boot 3.4.1
- Spring Cloud
- Spring Data JPA
- Eureka Discovery Server
- MongoDB Database
- Docker
- Maven

## Architecture

The architecture of this project includes the following components:

1. **Eureka Discovery Server**: Registers and manages all microservices.
2. **API Gateway (Eureka Discovery Client)**: Routes requests to the appropriate microservice.
3. **User Service**: Manages user-related operations.
4. **Order Service**: Handles order-related operations.
5. **Payment Service**: Manages payment-related operations.
6. **Config Server**: Manages configuration properties for all microservices from github repo.

## Getting Started

### Prerequisites

- Java 17
- Maven
- Docker (optional, for containerization)

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/UtkarshBhardwaj1/MicroserviceTutorial.git
    cd MicroserviceTutorial
    ```

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

3. Start the microservices:
    ```sh
    cd EurekaService
    mvn spring-boot:run
    # Open new terminal for each microservice
    cd ConfigService
    mvn spring-boot:run
    cd api-gateway
    mvn spring-boot:run
    cd UserService
    mvn spring-boot:run
    cd OrderService
    mvn spring-boot:run
    cd paymentService
    mvn spring-boot:run
    cd ProductService
    mvn spring-boot:run
    ```

## Usage

- **API Gateway**: Access all microservices via the API Gateway at `http://localhost:8080`.
- **Eureka Dashboard**: View registered microservices at `http://localhost:8761`.

## Contributing

Contributions are welcome! Please fork this repository and submit a pull request with your changes. Ensure you follow the [contribution guidelines](CONTRIBUTING.md).

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

