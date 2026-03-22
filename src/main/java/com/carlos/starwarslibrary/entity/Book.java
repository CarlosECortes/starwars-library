// Declare the package where this class belongs
package com.carlos.starwarslibrary.entity;

// Import JPA annotations used for mapping Java objects to database tables
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

// Mark this class as a JPA entity so Spring Boot knows it represents a database table
@Entity

// Map this entity to the BOOKS table in the MySQL database
@Table(name = "BOOKS")
public class Book {

    // Mark this field as the primary key
    @Id

    // Tell the database to automatically generate ID values
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Map the title column in the database
    @Column(name = "title")
    private String title;

    // Map the author column
    @Column(name = "author")
    private String author;

    // Map the series column
    @Column(name = "series")
    private String series;

    // Map the era column
    @Column(name = "era")
    private String era;

    // Map the publicationYear column
    @Column(name = "publication_year")
    private Integer publicationYear;

    // Map the canonStatus column
    @Column(name = "canon_status")
    private String canonStatus;

    // Default constructor required by JPA
    public Book() {
    }

    // Constructor used to create new Book objects with values
    public Book(String title, String author, String series, String era, int publicationYear, String canonStatus) {
        this.title = title;
        this.author = author;
        this.series = series;
        this.era = era;
        this.publicationYear = publicationYear;
        this.canonStatus = canonStatus;
    }

    // Getter method for id
    public int getId() {
        return id;
    }

    // Setter method for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for series
    public String getSeries() {
        return series;
    }

    // Setter for series
    public void setSeries(String series) {
        this.series = series;
    }

    // Getter for era
    public String getEra() {
        return era;
    }

    // Setter for era
    public void setEra(String era) {
        this.era = era;
    }

 // Getter for publicationYear
    public Integer getPublicationYear() {
        return publicationYear; // allows null safely
    }

    // Setter for publication year
    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Getter for canon status
    public String getCanonStatus() {
        return canonStatus;
    }

    // Setter for canon status
    public void setCanonStatus(String canonStatus) {
        this.canonStatus = canonStatus;
    }
}