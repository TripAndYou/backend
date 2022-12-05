package com.example.sprint4.controller;

import com.example.sprint4.domain.Article;
import com.example.sprint4.dto.requestDto.ArticleRequestDto;
import com.example.sprint4.dto.responseDto.ArticleListResponseDto;
import com.example.sprint4.dto.responseDto.ArticleResponseDto;
import com.example.sprint4.repository.ArticleRepository;
import com.example.sprint4.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
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

//    @GetMapping("/main/filter") //filter 게시글 read
//    public List<ArticleListResponseDto> readFilterArticle() {
//
//        return articleService.readFilterArticle();
//    }
//
//    @GetMapping("/main/suggestion") //suggestion 게시글 read
//    public List<ArticleListResponseDto> readSuggestionArticle() {
//
//        return articleService.readSuggestionArticle();
//    }
//
//    @GetMapping("/search/{keywords}/popularity") //popularity 검색
//    public Page<ArticleListResponseDto> searchPopularity(
//            @PathVariable String keywords,
//            @RequestParam("page") int page,
//            @RequestParam("size") int size
//    ) {
//        page = page - 1;
//        return articleService.searchPopularity(keywords, page, size);
//    }
}
