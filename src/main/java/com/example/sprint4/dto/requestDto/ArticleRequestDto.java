package com.example.sprint4.dto.requestDto;

import lombok.Getter;


@Getter
public class ArticleRequestDto {

    private String title;

    private String html;

    private String articleCity;

    private String articleDistri;

    public ArticleRequestDto(String title, String html, String articleCity, String articleDistri) {
        this.title = title;
        this.html = html;
        this.articleCity = articleCity;
        this.articleDistri = articleDistri;
    }
}
