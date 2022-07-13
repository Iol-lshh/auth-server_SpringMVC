package com.iollshh.authserver.domain.repository;

import com.iollshh.authserver.domain.entity.Member;
import com.iollshh.authserver.domain.repository.decorator.MemberRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
}
