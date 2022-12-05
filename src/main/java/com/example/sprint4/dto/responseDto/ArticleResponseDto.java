package com.example.sprint4.dto.responseDto;

import com.example.sprint4.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ArticleResponseDto {

    private int articleIdx;
    private LocalDateTime writeDate;
    private int articleUserIdx;
    private String title;
    private String content;
    private String articleCity;

    public ArticleResponseDto(Article article) {
        this.articleIdx = article.getArticleIdx();
        this.writeDate = article.getWriteDate();
        this.articleUserIdx = article.getArticleUserIdx();
        this.title =  article.getTitle();
        this.content = article.getContent();
        this.articleCity = article.getArticleCity();
    }
}
