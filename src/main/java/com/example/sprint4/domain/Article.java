package com.example.sprint4.domain;

import com.example.sprint4.dto.requestDto.ArticleRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Article extends Timestamped{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int articleIdx;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String content;

//    @Column
//    LocalDateTime writeDate;

    @Column(nullable = false)
    private int articleUserIdx;

    @Column(nullable = false)
    String articleCity;

    public Article(String title, String content, LocalDateTime writeDate, String articleCity) {
        this.title = title;
        this.content = content;
        this.articleCity = articleCity;
    }

    public Article(ArticleRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.articleCity = requestDto.getArticleCity();
    }

    public void update(ArticleRequestDto articleRequestDto) {
        this.title = articleRequestDto.getTitle();
        this.content = articleRequestDto.getContent();
        this.articleCity = articleRequestDto.getArticleCity();
    }
}
