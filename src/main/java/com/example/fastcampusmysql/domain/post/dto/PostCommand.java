package com.example.fastcampusmysql.domain.post.dto;

/**
 * @author love_
 */
public record PostCommand(
        Long memberId,
        String contents
) {
}
