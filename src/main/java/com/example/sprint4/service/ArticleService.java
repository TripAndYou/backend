package com.example.sprint4.service;

import com.example.sprint4.domain.Article;
import com.example.sprint4.dto.requestDto.ArticleRequestDto;
import com.example.sprint4.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;



    @Transactional
    public void createArticle(ArticleRequestDto articleRequestDto) {
        String title = articleRequestDto.getTitle();
        String html = articleRequestDto.getHtml();
        String articleCity = articleRequestDto.getArticleCity();

        Article article = new Article(title, html, articleCity);

        articleRepository.save(article);
    }

    @Transactional
    public int detailArticle(Integer articleIdx) {
        Article article = articleRepository.findById(articleIdx).orElseThrow(
                () -> new NullPointerException("게시글이 존재하지 않습니다.")
        );
        return article.getArticleIdx();
    }
}
