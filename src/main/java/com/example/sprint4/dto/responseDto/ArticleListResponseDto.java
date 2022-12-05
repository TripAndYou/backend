package com.example.sprint4.dto.responseDto;

import com.example.sprint4.domain.Article;
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
    private String articleDisty;

    public ArticleListResponseDto(Article article) {
        this.articleIdx = article.getArticleIdx();
        this.title  = article.getTitle();
        this.html = article.getHtml();
        this.articleCity = article.getArticleCity();
        this.articleDisty = article.getArticleDistri();
    }
}
