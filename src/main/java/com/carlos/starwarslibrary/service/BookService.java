// Declare the package where this class belongs
package com.carlos.starwarslibrary.service;

// Import required Java utilities
import java.util.List;

// Import Spring annotations
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Import the Book entity
import com.carlos.starwarslibrary.entity.Book;

// Import the repository that communicates with the database
import com.carlos.starwarslibrary.repository.BookRepository;

// Mark this class as a Spring Service component
// This allows Spring Boot to automatically manage it
@Service
public class BookService {

    // Automatically inject the BookRepository so we can use database methods
    @Autowired
    private BookRepository bookRepository;

    // Method to retrieve all books from the database
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Method to save a new book or update an existing book
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    // Method to retrieve a specific book by its ID
    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    // Method to delete a book by its ID
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

}