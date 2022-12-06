package com.example.sprint4.service;

import com.example.sprint4.domain.Article;
import com.example.sprint4.dto.requestDto.ArticleRequestDto;
import com.example.sprint4.dto.responseDto.ArticleListResponseDto;
import com.example.sprint4.dto.responseDto.ArticleResponseDto;
import com.example.sprint4.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional
    public int update(Integer articleIdx, ArticleRequestDto articleRequestDto) {
        Article article = articleRepository.findById(articleIdx).orElseThrow(
                () -> new NullPointerException("아이디 존재하지 않습니다.")
        );
        article.update(articleRequestDto);
        return article.getArticleIdx();
    }

    //게시글 읽기
    @Transactional
    public ArticleResponseDto readArticle(Integer articleIdx) {
        Article article = articleRepository.findByArticleIdx(articleIdx).orElseThrow(
                () -> new NullPointerException("게시글이 존재하지 않습니다.")
        );
        ArticleResponseDto articleResponseDto = new ArticleResponseDto(article);
        return articleResponseDto;
    }

    // 게시글 전체 목록 조회
    public List<ArticleListResponseDto> readAllArticle() {
        List<Article> articleList = articleRepository.findAllByOrderByWriteDateDesc();
        List<ArticleListResponseDto> articleListResponseDtoList = new ArrayList<>();
        for(int i = 0; i < articleList.size(); i++) {
            articleListResponseDtoList.add(new ArticleListResponseDto(articleList.get(i)));
        }
        return articleListResponseDtoList;
    }

    public List<ArticleListResponseDto> searchArticle(String keywords) {
        List<Article> articleList = articleRepository.findAllByArticleCityContainingOrArticleDistriContainingOrContentContainingOrTitleContainingOrderByWriteDateDesc(keywords, keywords, keywords, keywords);
        List<ArticleListResponseDto> articleListResponseDtoList = new ArrayList<>();
        for (int i = 0; i < articleList.size(); i++) {
            articleListResponseDtoList.add(new ArticleListResponseDto(articleList.get(i)));
        }
        return articleListResponseDtoList;
    }
}
