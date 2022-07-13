package com.iollshh.authserver.domain.repository.decorator;

import com.iollshh.authserver.domain.dto.MemberDto;
import com.iollshh.authserver.domain.entity.Member;

public interface MemberRepositoryCustom {

    //search Member by accountId
    Member getReferenceByAccountId(String AccountId);

    Member saveNewByDto(MemberDto memberDto);
}
