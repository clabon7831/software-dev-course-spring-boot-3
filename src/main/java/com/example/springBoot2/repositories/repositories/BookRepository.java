package com.example.springBoot2.repositories.repositories;


import com.example.springBoot2.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
