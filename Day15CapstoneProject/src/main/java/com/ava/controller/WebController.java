package com.ava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ava.model.Book;
import com.ava.service.BookService;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("/api")
public class WebController {
	
	@Autowired
	BookService bookService;
	
	
	@GetMapping(path="/books/{id}")
	public Book getBookById(@PathVariable int id) {
		System.out.println("In Controller");
		 return bookService.findById(id);
	}
	
	@GetMapping(path="/books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
		
	}
	
	@PostMapping(path="/books")
	public Book insertBook (@RequestBody Book book) {
		return bookService.insertBook(book);
	}
	
    @DeleteMapping("/books/{id}")
   public void removeBookById(@PathVariable int id) { 
    	bookService.removeBookById(id);
   }

    @PutMapping("/books/{id}")
    public Book updateBook (@RequestBody Book book,@PathVariable int id) {
    	return bookService.updateBookById(book,id);
    }
    
	
	

}
