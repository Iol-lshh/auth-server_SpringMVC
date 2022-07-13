package com.iollshh.authserver.domain.factory;

import com.iollshh.authserver.domain.dto.MemberDto;
import com.iollshh.authserver.domain.entity.Member;
import org.springframework.stereotype.Component;

@Component
public class MemberFactory {

    public MemberDto makeDtoByEntity(Member member){
        MemberDto memberDto = MemberDto.builder()
                .accountId(member.getAccountId())
                .nickname(member.getNickname())
                .accountType(member.getAccountType())
                .quit(member.getQuit())
                .build();
        return memberDto;
    }
}
