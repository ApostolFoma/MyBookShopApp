package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PopularController {

    private final BookService bookService;

    @Autowired
    public PopularController(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> bookList(){
        return bookService.getBooksData();
    }

    @GetMapping("/books/popular")
    public String popularPage(Model model) {
        model.addAttribute("bookList", bookList());
        return "/books/popular";
    }
}
