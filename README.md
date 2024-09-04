# Multi Product Transaction Manager

This project is a Spring Boot application that manages different types of product transactions. It includes handling requests for various product types such as loans, insurance, and credit.

## Features

- **Loan Product Requests**: Manage loan product transactions with details like loan amount and term in months.
- **Insurance Product Requests**: Handle insurance product transactions with policy number and coverage amount.
- **Credit Product Requests**: Manage credit product transactions with credit limit details.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/joyboy18900/multi-product-transaction-manager.git
    ```
2. Navigate to the project directory:
    ```sh
    cd multi_product_transaction_manager
    ```
3. Build the project using Maven:
    ```sh
    mvn clean install
    ```

### Running the Application

To run the application, use the following command:
```sh
mvn spring-boot:run
```

The application will start on `http://localhost:8080`.

## Usage

### Loan Product Request

To create a loan product request, send a POST request to `/loan` with the following JSON body:
```json
{
  "productId": "123",
  "productName": "Personal Loan",
  "loanAmount": 5000.0,
  "termInMonths": 24
}
```

### Insurance Product Request

To create an insurance product request, send a POST request to `/insurance` with the following JSON body:
```json
{
  "productId": "456",
  "productName": "Health Insurance",
  "policyNumber": "POL123456",
  "coverageAmount": 100000.0
}
```

### Credit Product Request

To create a credit product request, send a POST request to `/credit` with the following JSON body:
```json
{
  "productId": "789",
  "productName": "Credit Card",
  "creditLimit": 20000.0
}
```
