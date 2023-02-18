package com.example.fastcampusmysql.domain.post.dto;

import java.time.LocalDate;

/**
 * @author love_
 */
public record DailyPostCount(
        Long memberId,
        LocalDate date,
        Long postCount
) {
}
