package com.example.fastcampusmysql.apllication.controller;

import com.example.fastcampusmysql.apllication.usecase.CreateFollowMemberUseCase;
import com.example.fastcampusmysql.apllication.usecase.GetFollowingMembersUsecase;
import com.example.fastcampusmysql.domain.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/follow")
public class FollowController {

    final private CreateFollowMemberUseCase createFollowMemberUseCase;
    final private GetFollowingMembersUsecase getFollowingMembersUsecase;

    @PostMapping("/{fromId}/{toId}")
    public void create(@PathVariable Long fromId, @PathVariable Long toId) {
        createFollowMemberUseCase.excute(fromId, toId);
    }

    @GetMapping("/members/{fromId}")
    public List<MemberDto> create(@PathVariable Long fromId) {
        return getFollowingMembersUsecase.execute(fromId);
    }
}
