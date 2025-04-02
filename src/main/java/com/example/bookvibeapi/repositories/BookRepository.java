package com.example.bookvibeapi.repositories;

import com.example.bookvibeapi.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
