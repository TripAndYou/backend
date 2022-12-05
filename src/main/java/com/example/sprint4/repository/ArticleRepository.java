package com.example.sprint4.repository;

import com.example.sprint4.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

    Optional<Article> findByArticleIdx(Integer articleIdx);

    List<Article> findAllByOrderByWriteDateDesc(); //작성된 날짜를 내림차순으로 정렬(최신순 정렬)

    List<Article> findAllByFilterListOrderByWriteDateDesc();

    List<Article> findAllBySuggetionListOrderByWriteDateDesc();
}
