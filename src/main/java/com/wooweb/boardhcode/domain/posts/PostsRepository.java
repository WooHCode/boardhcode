package com.wooweb.boardhcode.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/** DB Layer접근자, extends JpaRepository를 해주면 자동으로 CRUD를 생성해준다
 * <1,2> 여기는 1번에 해당 엔티티클래스를, 2번에는 PK의 타입을 입력 */
public interface PostsRepository extends JpaRepository<Posts,Long> {
}
