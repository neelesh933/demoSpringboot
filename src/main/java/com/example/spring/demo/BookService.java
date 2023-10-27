package com.example.spring.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository; 
	
	
	public List<book>getAllBooks(){
		return(List<book>)bookRepository.findAll();
		
		
	}
	
	public  book getBookById(Long id) {
		return bookRepository.findById(id).orElse(null); 
	}
	
	public void addBook(book b) {
		bookRepository.save(b); 
	}
	
	public void deleteBook(Long id) {
		
		bookRepository.deleteById(id);

}
	
	public void updateBook(book b) {
		bookRepository.save(b); 
	}
	
}
