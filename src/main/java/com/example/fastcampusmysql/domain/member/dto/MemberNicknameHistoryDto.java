package com.example.fastcampusmysql.domain.member.dto;

import java.time.LocalDateTime;

/**
 * @author love_
 */
public record MemberNicknameHistoryDto(
        Long id,
        Long memeberId,
        String nickname,
        LocalDateTime createAt
) {
}
