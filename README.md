#  User Application

This project is a Spring Boot application for users. It provides CRUD (Create, Read, Update, Delete) operations for user data stored in a MySQL database.

## Features

# Create a New User
- Endpoint: POST /users
- Example Request:
    json
    {
        "name": "Pavani",
        "email": "pavani@gmail.com"
    }
    
- Example Response:
    json
    {
        "id": 1,
        "name": "Pavani",
        "email": "pavani@gmail.com"
    }
    

# Retrieve All Users

- Endpoint: GET /users
- Example Response:
    json
    [
        {
            "id": 1,
            "name": "Pavani",
            "email": "pavani@gmail.com"
        },
        {
            "id": 3,
            "name": "Rama",
            "email": "rama@gmail.com"
        },
        {
            "id": 4,
            "name": "Ram",
            "email": "ram@gmail.com"
        },
        {
            "id": 5,
            "name": "Pavani",
            "email": "pavani@gmail.com"
        }
    ]
    ```

# Retrieve a Single User by ID

- Endpoint: GET /users/{id}
- Example Request: GET /users/3
- Example Response:
    json
    {
        "id": 3,
        "name": "Rama",
        "email": "rama@gmail.com"
    }
    

# Update a User

- Endpoint: PUT /users/{id}
- Example Request: PUT/ users/3
     json
    {
        "name": "Rama Devi",
        "email": "rama@gmail.com"
    }
    ```
- Example Response:
    json
    {
        "id": 3,
        "name": "Rama Devi",
        "email":  "rama@gmail.com"
    }
    ```

### Delete a User

- Endpoint: DELETE /users/{id}
- Example Request: DELETE /users/2
- Example Response:
    json
    {
        "message": "User deleted "
    }
    

## Testing the API

You can use Postman or any other API testing tool to test the endpoints. Below are some example requests you can make:

# Create a User

- Method: POST
- *URL:http://localhost:8081/users
- *Body:
     json
    {
        "name": "Pavani",
        "email": "pavani@gmail.com"
    }
    

# Retrieve All Users

- Method: GET
- URL:http://localhost:8081/users

# Retrieve a Single User by ID

- *Method: GET
- *URL: http://localhost:8081/users/3

# Update a User

- *Method: PUT
- *URL: http://localhost:8081/users/3
- Body:
     json
    {
        "name": "Rama Devi",
        "email": "rama@gmail.com"
    }
    ```

# Delete a User

- *Method: DELETE
- *URL: http://localhost:8081/users/2

# Contributing

If you wish to contribute to the project, please fork the repository and submit a pull request.

