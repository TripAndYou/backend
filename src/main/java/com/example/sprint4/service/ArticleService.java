package com.example.sprint4.service;

import com.example.sprint4.domain.Article;
import com.example.sprint4.dto.requestDto.ArticleRequestDto;
import com.example.sprint4.dto.responseDto.ArticleListResponseDto;
import com.example.sprint4.dto.responseDto.ArticleResponseDto;
import com.example.sprint4.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.AbstractList;
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

    //filter 목록
//    public List<ArticleListResponseDto> readFilterArticle() {
//        List<Article> articleList = articleRepository.findAllByFilterListOrderByFilterRegTimeDesc(1);
//        List<ArticleListResponseDto> articleListResponseDto = new ArrayList<>(){
//        };
//        return articleListResponseDto;
//    }
//
//    //suggestion 목록
//    public List<ArticleListResponseDto> readSuggestionArticle() {
//        List<Article> articleList = articleRepository.findAllBySuggestionListOrderBySuggestionRegRimeDesc(1);
//        List<ArticleListResponseDto> articleListResponseDto = new ArrayList<>();
//        return articleListResponseDto;
//    }
//
//    //popularity 검색
//    public Page<ArticleListResponseDto> searchPopularity(String keywords, int page, int size) {
//        String keywordsTrimmed = keywords.trim();
//        List<ArticleListResponseDto> articleListResponseDtoList = new ArrayList<>();
//
//        //검색어를 통째로 포함하는 경우 해당 게시글을 검색 결과의 상단으로 이동
//        for(int i = 0; i < articleListResponseDtoList.size(); i++) {
//            if(articleListResponseDtoList.get(i).getTitle().contains(keywordsTrimmed)) {
//                articleListResponseDtoList.add(0, articleListResponseDtoList.get(i));
//                articleListResponseDtoList.remove(i + 1);
//            }
//        }
//        Pageable pageable = PageRequest.of(page, size);
//
//        final int start = (int) pageable.getOffset();
//        final int end = Math.min((start + pageable.getPageSize()), articleListResponseDtoList.size());
//        final Page<ArticleListResponseDto> resultpage = new PageImpl<>(articleListResponseDtoList.subList(start, end), pageable, articleListResponseDtoList.size());
//
//        return resultpage;
//    }
}
