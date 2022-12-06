package com.example.sprint4.controller;

import com.example.sprint4.domain.Article;
import com.example.sprint4.dto.requestDto.ArticleRequestDto;
import com.example.sprint4.dto.responseDto.ArticleListResponseDto;
import com.example.sprint4.dto.responseDto.ArticleResponseDto;
import com.example.sprint4.repository.ArticleRepository;
import com.example.sprint4.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final ArticleRepository articleRepository;
    private final ArticleService articleService;

    @PostMapping("/article") //create
    public Article createArticle(@RequestBody ArticleRequestDto articleRequestDto) {
        Article article = new Article(articleRequestDto);
        return articleRepository.save(article);
    }

    @GetMapping("/article/detail/{articleIdx}") //read
    public ArticleResponseDto readArticle(@PathVariable Integer articleIdx) {
        return articleService.readArticle(articleIdx);
    }

    @GetMapping("/all/article") //전체 게시물 read
    public List<ArticleListResponseDto> readAllArticle() {
        return articleService.readAllArticle();
    }

    @GetMapping("/article/{keywords}/search") //게시물 검색
    public List<ArticleListResponseDto> searchArticle(@PathVariable String keywords) {
        return articleService.searchArticle(keywords);
    }
}
