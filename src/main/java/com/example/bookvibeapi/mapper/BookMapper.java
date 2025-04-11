package com.example.bookvibeapi.mapper;


import org.springframework.stereotype.Component;

import com.example.bookvibeapi.dtos.BookDTO;
import com.example.bookvibeapi.dtos.CollectionDTO;
import com.example.bookvibeapi.models.Book;
import com.example.bookvibeapi.models.Collection;

import java.util.stream.Collectors;

@Component
public class BookMapper {

    public BookDTO toBookDTO(Book book) {
        return BookDTO.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .build();
    }

    public CollectionDTO toCollectionDTO(Collection collection) {
        CollectionDTO dto = new CollectionDTO();
        dto.setId(collection.getId());
        dto.setName(collection.getName());

        if (collection.getBooks() != null) {
            dto.setBooks(collection.getBooks().stream()
                    .map(collectionBook -> toBookDTO(collectionBook.getBook()))
                    .collect(Collectors.toList()));
        }

        return dto;
    }
}