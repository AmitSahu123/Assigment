package com.book.service1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.book.Repsotiory.BookRepositiory;
import com.book.entity.BOOK;

@Service
public class BookService {
	
	private BookRepositiory bookrepostiory;
	
//	private static List<BOOK> list=new ArrayList<>();
//	static {
//		list.add(new BOOK(12,"JAV IS A COMPILER","XYZ"));
//		list.add(new BOOK(13,"JAV IS A COMPILER","XYZ"));
//		list.add(new BOOK(14,"JAV IS A COMPILER","XYZ"));
//	}
	public List<BOOK> getAllBooks(){
		List<BOOK> list= (List<BOOK>)this.bookrepostiory.findAll();
		return list ;
	}
	
	public BOOK getBookId(int id)
	{
		BOOK book=null;
		try {
			book=this.bookrepostiory.findById(id);
			
		}
		catch(Exception e) {
			
			
		}
		return book;
	
	}
	
    //adding the book
	public BOOK addBook(BOOK b) {
		BOOK result = bookrepostiory.save(b);
		return result;
	}

	public void deleteBook(int bid) {
//		list=list.stream().filter(book->{
//			if (book.getId()!=bid) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}).collect(Collectors.toList());
		bookrepostiory.deleteById(bid);
		
	}

	public void updateBOOK(BOOK book,int bookId) {
//		list.stream().map(b->{
//			if(b.getId()==bookId) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;
//			
//		}).collect(Collectors.toList());
		book.setId(bookId);
		bookrepostiory.save(book);
		
	}

}

