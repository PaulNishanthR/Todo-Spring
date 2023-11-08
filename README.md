# Todo-Spring
# Spring Boot Todo API
  A simple RESTful API built with Spring Boot for managing Todo items.
# Introduction
  This project provides a basic Todo API with CRUD (Create, Read, Update, Delete) operations. It uses Spring Boot and connects to a database to store and retrieve Todo items.
# Endpoints
  - **GET /api/todo/all:** Get a list of all Todo items.
  - **GET /api/todo/{id}:** Get a specific Todo item by ID.
  - **POST /api/todo:** Add a new Todo item.
  - **PUT /api/todo:** Update an existing Todo item.
  - **DELETE /api/todo/{id}:** Delete a Todo item by ID
# Usage
You can use tools like Postman, cURL, or any HTTP client to interact with the API.
# Retrieve all todos:
GET : http://localhost:8080/api/todo/all
# Get a specific todo by ID:
GET : http://localhost:8080/api/todo/1
# Add a new todo:
POST : http://localhost:8080/api/todo
# Update an existing todo:
PUT : http://localhost:8080/api/todo
# Delete a todo by ID:
DELETE : http://localhost:8080/api/todo/1
