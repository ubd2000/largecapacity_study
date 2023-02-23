package com.example.fastcampusmysql.domain.follow.service;

import com.example.fastcampusmysql.domain.follow.dto.FollowDto;
import com.example.fastcampusmysql.domain.follow.entity.Follow;
import com.example.fastcampusmysql.domain.follow.repository.FollowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class FollowReadService {
    private final FollowRepository followRepository;

    public List<FollowDto> getFollowings(Long memberId) {
        List<Follow> follows = followRepository.findAllByFromMemberId(memberId);
        return toDto(follows);
    }

    public List<FollowDto> getFollowers(Long memberId) {
        List<Follow> follows = followRepository.findAllByToMemberId(memberId);
        return toDto(follows);
    }

    private List<FollowDto> toDto(List<Follow> follows) {
        List<FollowDto> followDtos = new ArrayList<>();
        for (Follow follow : follows) {
            followDtos.add(new FollowDto(
                    follow.getId(),
                    follow.getFromMemberId(),
                    follow.getToMemberId(),
                    follow.getCreatedAt()));
        }

        return followDtos;
    }
}
