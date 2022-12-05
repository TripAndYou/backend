package com.example.sprint4.dto.requestDto;

import lombok.Getter;


@Getter
public class ArticleRequestDto {

    private String title;

    private String content;

    private String articleCity;

    private String articleDistri;

    public ArticleRequestDto(String title, String content, String articleCity, String articleDistri) {
        this.title = title;
        this.content = content;
        this.articleCity = articleCity;
        this.articleDistri = articleDistri;
    }
}
