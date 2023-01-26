package com.example.fastcampusmysql.apllication.usecase;

import com.example.fastcampusmysql.domain.follow.service.FollowWriteService;
import com.example.fastcampusmysql.domain.member.service.MemberReadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateFollowMemberUseCase {
    final private MemberReadService memberReadService;
    final private FollowWriteService followWriteService;
    public void excute(Long fromMemberId, Long toMemberId) {
        /*
            1. 입력받은 memberID로 회원조회
            2. FollowWriteService.create()
         */
        var fromMember = memberReadService.getMember(fromMemberId);
        var toMember = memberReadService.getMember(toMemberId);

        followWriteService.create(fromMember, toMember);
    }
}
