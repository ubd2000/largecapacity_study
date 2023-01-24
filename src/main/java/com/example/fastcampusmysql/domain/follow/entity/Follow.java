package com.example.fastcampusmysql.domain.follow.entity;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author love_
 */
@Getter
public class Follow {
    final private Long id;
    final private Long fromMemberId;
    final private Long toMemberId;
    final private LocalDateTime createdAt;

    public Follow(Long id, Long fromMemberId, Long toMemberId, LocalDateTime createdAt) {
        this.id = id;
        this.fromMemberId = Objects.requireNonNull(fromMemberId);
        this.toMemberId = Objects.requireNonNull(toMemberId);
        this.createdAt = createdAt == null ? LocalDateTime.now() : createdAt;
    }
}
