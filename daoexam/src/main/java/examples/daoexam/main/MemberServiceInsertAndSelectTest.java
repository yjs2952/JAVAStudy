package examples.daoexam.main;


import examples.daoexam.config.ApplicationConfig;
import examples.daoexam.dto.Member;
import examples.daoexam.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class MemberServiceInsertAndSelectTest {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);

        /*Member member = new Member();
        member.setEmail("yjs2952@naver.com");
        member.setName("윤지수");
        member.setPassword("1234");
        member.setRegDate(new Date());
        member = memberService.addMember(member);*/

        Member member = memberService.getMemberByEmail("yjs2952@naver.com");
        if (member != null) {
            System.out.println(member.toString());
        } else {
            System.out.println("null 입니다");
        }

    }
}
