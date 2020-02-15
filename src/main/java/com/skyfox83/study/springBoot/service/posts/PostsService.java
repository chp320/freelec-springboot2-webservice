package com.skyfox83.study.springBoot.service.posts;

import com.skyfox83.study.springBoot.domain.posts.Posts;
import com.skyfox83.study.springBoot.domain.posts.PostsRepository;
import com.skyfox83.study.springBoot.web.dto.PostsResponseDto;
import com.skyfox83.study.springBoot.web.dto.PostsSaveRequestDto;
import com.skyfox83.study.springBoot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository ;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId() ;
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id)) ;

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id ;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id)
                            .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id)) ;

        return new PostsResponseDto(entity) ;
    }
}
