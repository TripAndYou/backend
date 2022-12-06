package com.example.sprint4.repository;

import com.example.sprint4.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

    Optional<Article> findByArticleIdx(Integer articleIdx);

    List<Article> findAllByOrderByWriteDateDesc();

    List<Article> findAllByArticleCityContainingOrArticleDistriContainingOrContentContainingOrTitleContainingOrderByWriteDateDesc(String title, String content, String articleCity, String articleDistri);
}
