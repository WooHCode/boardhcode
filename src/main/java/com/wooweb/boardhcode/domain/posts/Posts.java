package com.wooweb.boardhcode.domain.posts;

import com.wooweb.boardhcode.domain.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter  /** 모든 필드의 Getter 메소드 생성 */
@NoArgsConstructor /** 기본 생성자 자동 추가*/
@Entity /** 테이블과 직접 링크될 클래스임을 명시 */
public class Posts extends BaseTimeEntity {
    @Id  /** Primary key 임을 명시함 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)  /** auto_increment 를 해줌 */
    private Long id;

    @Column(length = 500, nullable = false)  /** @Column을 선언해주지 않아도 되나, 특별히 default값에서 변경하고 싶은 내용이 있다면 명시 */
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    /**  빌더 패턴을 생성해준다. 파라미터가 많아질수록 가독성이 안좋아지므로 선호한다.
     ex) Posts posts = Posts.builder().title("title").content("content").author("author").build();*/
    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }

}
