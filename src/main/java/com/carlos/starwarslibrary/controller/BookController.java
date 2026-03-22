// Declare the package where this class belongs
package com.carlos.starwarslibrary.controller;

// Import Java utilities
import java.util.List;

// Import Spring annotations and MVC tools
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// Import the Book entity
import com.carlos.starwarslibrary.entity.Book;

// Import the service layer
import com.carlos.starwarslibrary.service.BookService;

// Mark this class as a Spring MVC controller
@Controller
public class BookController {

    // Automatically inject the BookService
    @Autowired
    private BookService bookService;

    // Display the home page showing the list of books
    @GetMapping("/")
    public String viewHomePage(Model model) {

        // Retrieve all books from the database
        List<Book> listBooks = bookService.getAllBooks();

        // Add the book list to the model so Thymeleaf can display it
        model.addAttribute("listBooks", listBooks);

        // Return the name of the Thymeleaf template
        return "booklist";
    }

    // Show the form to add a new book
    @GetMapping("/showNewBookForm")
    public String showNewBookForm(Model model) {

        // Create a new Book object
        Book book = new Book();

        // Add the object to the model
        model.addAttribute("book", book);

        // Return the add-book template
        return "add-book";
    }

    // Save a book to the database
    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book book) {

        // Call the service to save the book
        bookService.saveBook(book);

        // Redirect back to the homepage
        return "redirect:/";
    }

    // Show the form to update an existing book
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {

        // Retrieve the book from the database
        Book book = bookService.getBookById(id);

        // Add the book object to the model
        model.addAttribute("book", book);

        // Return the edit page
        return "edit-book";
    }

    // Delete a book
    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable(value = "id") int id) {

        // Call the service to delete the book
        bookService.deleteBook(id);

        // Redirect to the homepage
        return "redirect:/";
    }

}