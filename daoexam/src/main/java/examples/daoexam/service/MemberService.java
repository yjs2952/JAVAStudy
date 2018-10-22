package examples.daoexam.service;

import examples.daoexam.dto.Member;

// 멤버 비지니스 메소드 선언
public interface MemberService {
    Member addMember(Member member);
    Member getMemberByEmail(String email);
}
