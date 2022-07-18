package com.springspring.study.mappedSuperClassAndEmbeddable.application;

import com.springspring.study.mappedSuperClassAndEmbeddable.domain.Member;
import com.springspring.study.mappedSuperClassAndEmbeddable.domain.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findAll() {
        memberRepository.save(new Member("멤버1", "01302132132"));
        memberRepository.save(new Member("멤버2", "2222222222"));

        return memberRepository.findAll();
    }
}
