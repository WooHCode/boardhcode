package com.wooweb.boardhcode.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter /** getter */
@RequiredArgsConstructor  /** 이 어노테이션을 사용하면 final을 이니셜라이즈를 해준다(this.name 등) */

public class HelloResponseDto {
    private final String name;
    private final int amount;
}
