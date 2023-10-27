package com.example.spring.demo;

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

@RestController
@RequestMapping("/api/books")
@CrossOrigin
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public List<book> getAllBooks(){
		return bookService.getAllBooks(); 
	}
	
	@GetMapping("/{id}")
	
	public book getBookById(@PathVariable Long id ) {
		
		return bookService.getBookById(id); 
	}
	
	
	@PostMapping
	
	public  void addBook(@RequestBody book b) {
		bookService.addBook(b);
	}
	
	
	@PutMapping("/{id}")
	public void updateBook(@PathVariable Long id ,  @RequestBody book b) {
		
		bookService.updateBook(b); 
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Long id ) {
		bookService.deleteBook(id) ; 
	}
}
