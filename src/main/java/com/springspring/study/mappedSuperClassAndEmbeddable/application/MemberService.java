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

    public void save(String name, String phoneNumber) {
        memberRepository.save(new Member(name, phoneNumber));
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
