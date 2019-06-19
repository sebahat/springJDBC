package com.JdbcDtoPattern.jdbcDto.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "author", schema = "library")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    int id;

    @Column(name = "name")

    String name;

    //TODO add nullable value moddelmapper using dto 27.05.2019
    @Column(name = "surname")
    String surname;

    @JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "authors", cascade = CascadeType.PERSIST)
    private List<Books> authorBooks;

    public Author() {

    }


    public List<Books> getAuthorBooks() {
        return authorBooks;
    }

    public void addBooks(List<Books> books) {
        if (this.authorBooks == null) {
            this.authorBooks = new ArrayList<>();
        }
        authorBooks = books;

    }

    public void setAuthorBooks(List<Books> authorBooks) {
        this.authorBooks = authorBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }
}
