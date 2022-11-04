package com.wooweb.boardhcode.service.posts;

import com.wooweb.boardhcode.domain.posts.PostsRepository;
import com.wooweb.boardhcode.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * PostsService에서는 Controller와 Repository를 연결해주는 중간 역활을 맡으며,
 * Controller는 Service를 injection받아 HTTP통신을 통한 CRUD method를 구축한다.
 * */
@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
