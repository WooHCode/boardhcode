package com.wooweb.boardhcode.service.posts;

import com.wooweb.boardhcode.domain.posts.Posts;
import com.wooweb.boardhcode.domain.posts.PostsRepository;
import com.wooweb.boardhcode.web.dto.PostsResponseDto;
import com.wooweb.boardhcode.web.dto.PostsSaveRequestDto;
import com.wooweb.boardhcode.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * PostsService에서는 Controller와 Repository를 연결해주는 중간 역활을 맡으며,
 * Controller는 Service를 injection받아 HTTP통신을 통한 CRUD method를 구축한다.
 *
 * 필요한 로직을 구성해준다.
 * */
@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    /**
     * postsRepository에서 id를 기반으로 한개의 데이터를 가져와 posts에 담아서 updateRequestDto에서 title,content를 가져와 수정한다.
     * 이때 id가 매칭되지 않는다면 exception을 던진다.
     */
    @Transactional
    public Long update(Long id, PostsUpdateRequestDto updateRequestDto){
        Posts posts = postsRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        posts.update(updateRequestDto.getTitle(),updateRequestDto.getContent());

        return id;
    }
    public PostsResponseDto findById(Long id){
        Posts entity = postsRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new PostsResponseDto(entity);
    }

}
