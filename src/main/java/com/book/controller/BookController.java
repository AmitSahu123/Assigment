package com.book.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.BOOK;
import com.book.service1.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService  BookService;
	
	//get all books handler
	   @GetMapping("/books")
    public List<BOOK> getBooks(){
    return this.BookService.getAllBooks();
	}
	   //get single book handle
	   @GetMapping("/books/{id}")
	 public BOOK getbook(@PathVariable("id") int id) {
		 return  this.BookService.getBookId(id);
	 }
	   //new book handler
	   @PostMapping("/books")
	   public BOOK addBook(@RequestBody BOOK book) {
		   BOOK b=this.BookService.addBook(book);
		   return b;
	   }
	   
	   //delete book handle
	   @DeleteMapping("/books/{bookId}")
	   public void deleteBook(@PathVariable("bookId") int bookId) {
		   
		   this.BookService.deleteBook(bookId);
		  }
	   //update the book
	   @PutMapping("/books/{bookId}")
	   public void updateBook(@RequestBody BOOK book,@PathVariable("bookId") int bookId) {
		   this.BookService.updateBOOK(book,bookId);
	   }
	   
	   

}
