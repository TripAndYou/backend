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
    String html;

//    @Column
//    LocalDateTime writeDate;

    @Column(nullable = false)
    private int articleUserIdx;

    @Column(nullable = false)
    String articleCity;

    @Column(nullable = false)
    String articleDistri;

    public Article(String title, String html, String articleCity, String articleDistri) {
        this.title = title;
        this.html = html;
        this.articleCity = articleCity;
        this.articleDistri = articleDistri;
    }

    public Article(ArticleRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.html = requestDto.getHtml();
        this.articleCity = requestDto.getArticleCity();
        this.articleDistri = requestDto.getArticleDistri();
    }

    public void update(ArticleRequestDto articleRequestDto) {
        this.title = articleRequestDto.getTitle();
        this.html = articleRequestDto.getHtml();
        this.articleCity = articleRequestDto.getArticleCity();
        this.articleDistri = articleRequestDto.getArticleDistri();
    }
}
