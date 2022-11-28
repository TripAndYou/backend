package com.example.sprint4.service;

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
        
    }
}
