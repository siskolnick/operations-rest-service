
# Operations REST API

This project was generated with [Spring Boot](https://spring.io/projects/spring-boot) version 2.4.3.

## Endpoints

Method | Endpoint | Function
| ------ | ------ | ------ |
GET | api/operations | List of operations |
POST | api/operations/sum | getASum |
POST | api/operations/product | getAProduct |
POST | api/operations/power | getAPower |

## Prerequisites

JDK 1.8 or later
Maven 3.2+
You can also import the code straight into your IDE

## Config

Edit application properties for database (MySQL):

spring.datasource.url=jdbc:mysql://yourdatabase:yourport/operations
spring.datasource.username=user
spring.datasource.password=password

Execute script "operations.sql" for creating the database.

## Code scaffolding

It can be generated with [Spring Initializr](https://start.spring.io/)

## Test the service

java com.example.codechallenge.CodechallengeApplication
localhost:8080/api/operations

