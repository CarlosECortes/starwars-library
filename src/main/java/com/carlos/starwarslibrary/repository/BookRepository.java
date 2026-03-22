// Declare the package where this interface belongs
package com.carlos.starwarslibrary.repository;

// Import the Book entity class so the repository knows what object it manages
import com.carlos.starwarslibrary.entity.Book;

// Import the JpaRepository interface from Spring Data JPA
import org.springframework.data.jpa.repository.JpaRepository;

// Create a repository interface that extends JpaRepository
// JpaRepository automatically provides CRUD database operations
public interface BookRepository extends JpaRepository<Book, Integer> {

    // Spring Boot will automatically provide methods such as:
    // save()       -> insert or update a book
    // findAll()    -> retrieve all books
    // findById()   -> retrieve a book by ID
    // deleteById() -> delete a book by ID

}