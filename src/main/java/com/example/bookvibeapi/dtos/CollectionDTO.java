package com.example.bookvibeapi.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class CollectionDTO {
    private Long id;
    private String name;
    private List<BookDTO> books = new ArrayList<>();
}