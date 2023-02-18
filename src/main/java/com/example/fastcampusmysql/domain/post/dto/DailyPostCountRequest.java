package com.example.fastcampusmysql.domain.post.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author love_
 */
public record DailyPostCountRequest(
        Long memberId,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate firstDate,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate lastDate
) {
}
