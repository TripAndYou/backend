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
    private String content;
    private String articleCity;
    private String articleDistri;

    public ArticleListResponseDto(Article article) {
        this.articleIdx = article.getArticleIdx();
        this.writeDate = article.getWriteDate();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.articleCity = article.getArticleCity();
        this.articleDistri = article.getArticleDistri();

    }
}
