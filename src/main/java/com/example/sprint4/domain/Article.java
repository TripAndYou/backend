package com.example.sprint4.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity //테이블과 연계됨을 스프링에게 알려줌
@Getter
@Setter
@NoArgsConstructor //기본 생성자 만들기
public class Article extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int articleIdx;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String html;

    @Column
    LocalDateTime writeDate;

    @Column(nullable = false)
    private int articleUserIdx;

    @Column(nullable = false)
    String articleCity;

    public Article(int articleIdx, String title, String html, LocalDateTime writeDate, int articleUserIdx, String articleCity) {
        this.articleIdx = articleIdx;
        this.title = title;
        this.html = html;
        this.writeDate = writeDate;
        this.articleUserIdx = articleUserIdx;
        this.articleCity = articleCity;
    }


}
