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

    @Column(nullable = true)
    String html;

//    @Column
//    LocalDateTime writeDate;

    @Column(nullable = false)
    private int articleUserIdx;

    @Column(nullable = false)
    String articleCity;

    public Article(String title, String html, LocalDateTime writeDate, String articleCity) {
        this.title = title;
        this.html = html;
        this.articleCity = articleCity;
    }

    public Article(ArticleRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.html = requestDto.getHtml();
        this.articleCity = requestDto.getArticleCity();
    }

    public void update(ArticleRequestDto articleRequestDto) {
        this.title = articleRequestDto.getTitle();
        this.html = articleRequestDto.getHtml();
        this.articleCity = articleRequestDto.getArticleCity();
    }
}
