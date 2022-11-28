package com.example.sprint4.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ArticleListResponseDto {

    private int articleIdx;
    private LocalDateTime writeDate;
    private String title;
    private String html;
    private String articleCity;
}
