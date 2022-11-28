package com.example.sprint4.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
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

}
