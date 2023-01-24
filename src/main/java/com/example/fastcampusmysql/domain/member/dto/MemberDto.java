package com.example.fastcampusmysql.domain.member.dto;

import java.time.LocalDate;

/**
 * @author love_
 */
public record MemberDto(
        Long id,
        String email,
        String nickname,
        LocalDate birthday
) {
}
