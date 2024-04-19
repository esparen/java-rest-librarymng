# Library Management App

This is a library management application designed to efficiently manage members, visitors, librarians, books, and book loans in a library setting. The application provides a set of endpoints for performing CRUD (Create, Read, Update, Delete) operations on various entities within the system.

## Features

### Membros
- **Read:** Retrieve information about members.
- **Insert:** Add new members to the system.
- **Delete:** Remove existing members from the system.
- **Update:** Modify information about existing members.

### Visitantes
- **Read:** Retrieve information about visitors.
- **Insert:** Add new visitors to the system.
- **Delete:** Remove existing visitors from the system.
- **Update:** Modify information about existing visitors.

### Bibliotecarios
- **Read:** Retrieve information about librarians.
- **Insert:** Add new librarians to the system.
- **Delete:** Remove existing librarians from the system.
- **Update:** Modify information about existing librarians.

### Livros
- **Read:** Retrieve information about books.
- **Insert:** Add new books to the system.
- **Delete:** Remove existing books from the system.
- **Update:** Modify information about existing books.

### Emprestimos
- **Read:** Retrieve information about book loans.
- **Insert:** Add new book loans to the system.
- **Delete:** Remove existing book loans from the system.
- **Update:** Modify information about existing book loans.

### Database Schema Initialization and Mocked Data Insertion
- The application provides database schema initialization to set up the required tables for storing information about members, visitors, librarians, books, and book loans.
- Mocked data insertion feature allows populating the database with sample data for testing and demonstration purposes.

## Technologies Used

- **Java Spring Boot:** Backend framework for building robust and scalable RESTful APIs.
- **Spring Data JPA:** Persistence layer abstraction for working with databases.
- **Spring MVC:** Model-View-Controller architecture for building web applications.
- **PostgreSQL:** Relational database management system for storing application data.
- **Maven:** Dependency management tool for Java projects.

## Getting Started

To get started with the application, follow these steps:

1. **Clone the Repository:** 
`git clone https://github.com/esparen/java-rest-librarymng.git`

3. **Navigate to the Project Directory:** 
`cd java-rest-librarymng`

4. **Build the Project:** 
`mvn clean package`

5. **Run the Application:** 
`java -jar target/java-rest-librarymng.jar` 

6. **Explore and Use the Endpoints:** 
Use the provided endpoints to perform CRUD operations on membros, visitantes, bibliotecarios, livros, and emprestimos.

## Contributing

Contributions are welcome! If you have any ideas, suggestions, or improvements for the application, feel free to open an issue or create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](https://opensource.org/license/mit) file for details.

