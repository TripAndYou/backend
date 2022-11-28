package com.example.sprint4.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ArticleResponseDto {

    private int articleIdx;

    private String title;

    private String html;

    private LocalDateTime writeDate;

    private int articleUserIdx;

    private String articleCity;
}
