package com.example.fastcampusmysql.domain.post.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author love_
 */
@Getter
public class Post {
    final private Long id;
    final private Long memberId;
    final private String contents;
    private Long likeCount;
    private Long version;
    final private LocalDate createdDate;
    final private LocalDateTime createdAt;

    @Builder
    public Post(Long id, Long memberId, String contents, Long version, LocalDate createdDate, Long likeCount, LocalDateTime createdAt) {
        this.id = id;
        this.memberId = Objects.requireNonNull(memberId);
        this.contents = Objects.requireNonNull(contents);
        this.createdDate = createdDate == null ? LocalDate.now() : createdDate;
        this.likeCount = likeCount == null ? 0 : likeCount;
        this.version = version == null ? 0 : version;
        this.createdAt = createdAt == null ? LocalDateTime.now() : createdAt;
    }

    public void incrementLikeCount() {
        likeCount += 1;
    }
}
