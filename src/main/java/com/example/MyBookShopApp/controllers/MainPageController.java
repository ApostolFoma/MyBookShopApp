package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/bookshop")
public class MainPageController {

    private final BookService bookService;

    @Autowired
    public MainPageController(BookService bookService) {
        this.bookService = bookService;
    }

/*    @ModelAttribute("bookData")
    public List<Book> recommendedBooks(){
        return bookService.getBooksData();
    }*/

    public List<Book> recommendedBooks(){
        return bookService.getBooksData();
    }

    @GetMapping("/main")
    public String mainPage(Model model){
        model.addAttribute("recommendedBooks", recommendedBooks());
/*        model.addAttribute("searchPlaceholder","new search placeholder");
        model.addAttribute("serverTime", new Date());
        model.addAttribute("placeholderTextPart2","SERVER");
        model.addAttribute("messageTemplate","searchbar.placeholder2");*/
        return "index";
    }
}


