package com.skyfox83.study.springBoot.web.dto;

import com.skyfox83.study.springBoot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id ;
    private String title ;
    private String author ;
    private LocalDateTime modifiedDate ;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId() ;
        this.title = entity.getTitle() ;
        this.author = entity.getAuthor() ;
        this.modifiedDate = entity.getModifiedDate() ;
    }
}
