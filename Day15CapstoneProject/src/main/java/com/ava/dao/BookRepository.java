package com.ava.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ava.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
	

}
