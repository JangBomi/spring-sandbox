package com.springspring.study.mappedSuperClassAndEmbeddable.application;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.springspring.study.mappedSuperClassAndEmbeddable.domain.Member;
import java.util.List;
import javax.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    void findAllTest() {
        memberService.save("멤버1", "01031221311");
        memberService.save("멤버2", "01034322588");

        List<Member> members = memberService.findAll();

        assertThat(members).hasSize(2);
    }
}
