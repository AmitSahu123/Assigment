package com.book.Repsotiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.entity.BOOK;

public interface BookRepositiory extends JpaRepository<BOOK, Integer> {
	public BOOK findById(int id);

}
