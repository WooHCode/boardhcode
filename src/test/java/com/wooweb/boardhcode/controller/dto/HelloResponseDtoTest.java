package com.wooweb.boardhcode.controller.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/** 롬복 기능이 잘 적용되어있는지(getxxx()) 확인하는 테스트 */
public class HelloResponseDtoTest {
    @Test
    public void 롬복기능테스트(){
        //given
        String name = "name";
        int amount = 1234;
        //when  생성
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        /** assertj을 사용하여 테스트 비교 메서드 호출 */
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
