package com.example.sprint4.repository;

import com.example.sprint4.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    List<Article> findAllByOrderByWriteDateDesc(); //작성된 날짜를 내림차순으로 정렬(최신순 정렬)
}
