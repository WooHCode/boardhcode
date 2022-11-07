package com.wooweb.boardhcode.web;

import com.wooweb.boardhcode.service.posts.PostsService;
import com.wooweb.boardhcode.web.dto.PostsResponseDto;
import com.wooweb.boardhcode.web.dto.PostsSaveRequestDto;
import com.wooweb.boardhcode.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    /**
     * 파라미터로 @RequestBody를 사용하는데 이것은 PUT, POST시에 사용한다.
     * */
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    /**
     * 한개의 데이터를 GET할 때 @PathVariable 로 파라미터를 사용하여 가져온다.
     * */
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }

    /**
     * @PathVariable로 한개의 데이터를 GET해서 가져와 PostsUpdateRequestDto에 content와 author의 데이터를 수정한다.
     */
    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }
}
