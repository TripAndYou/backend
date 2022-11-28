package com.example.sprint4.controller;

import com.example.sprint4.dto.requestDto.ArticleRequestDto;
import com.example.sprint4.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping("/article")
    public void createArticle(@RequestBody ArticleRequestDto articleRequestDto) {
        articleService.createArticle(articleRequestDto);


    }

    @GetMapping("/article/detail/{articleIdx}")
    public int detailArticle(@PathVariable Integer articleIdx) {
        return articleService.detailArticle(articleIdx);
    }

}
