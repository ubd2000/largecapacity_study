package com.example.fastcampusmysql.apllication.usecase;

import com.example.fastcampusmysql.domain.follow.dto.FollowDto;
import com.example.fastcampusmysql.domain.follow.service.FollowReadService;
import com.example.fastcampusmysql.domain.member.dto.MemberDto;
import com.example.fastcampusmysql.domain.member.service.MemberReadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GetFollowingMembersUsecase {
    private final MemberReadService memberReadService;
    private final FollowReadService followReadService;
    public List<MemberDto> execute(Long memberId) {
        /*
            1. fromMemberId = memberId -> Follow list
            2. 1번을 순회하면서 회원정보를 찾으면 된다!
         */
        var followings = followReadService.getFollowings(memberId);
        var followinMemberIds = followings.stream().map(FollowDto::toMemberId).toList();
        return memberReadService.getMembers(followinMemberIds);
    }
}
