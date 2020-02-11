package com.skyfox83.study.springBoot.web.dto;

import lombok.Getter ;
import lombok.RequiredArgsConstructor ;

@Getter // 선언된 모든 필드의 get 메소드를 생성 => 필드가 뭐지??
@RequiredArgsConstructor    // 생성된 모든 final 필드가 포함된 생성자를 생성 (final 필드 없으면 생성자 미포함)
public class HelloResponseDto {
    private final String name ;
    private final int amount ;
}
