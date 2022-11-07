package com.wooweb.boardhcode.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // BaseTimeEntity를 상속하면 createdDate, modifiedDate도 칼럼으로 인식
@EntityListeners(AuditingEntityListener.class) //이 클래스에 Auditing 기능을 포함
public abstract class BaseTimeEntity {

    @CreatedDate  // Entity가 생성되어 저장될때 시간을 저장
    private LocalDateTime createdDate;

    @LastModifiedDate // 수정될때 시간을 저장
    private LocalDateTime modifiedDate;
}
