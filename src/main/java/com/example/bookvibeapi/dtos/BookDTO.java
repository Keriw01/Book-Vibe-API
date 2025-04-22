package com.example.bookvibeapi.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class BookDTO {
    private Long id;
    private String title;
    private String author;
}
