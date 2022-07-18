package com.springspring.study.mappedSuperClassAndEmbeddable.presentation;

import com.springspring.study.mappedSuperClassAndEmbeddable.application.MemberService;
import com.springspring.study.mappedSuperClassAndEmbeddable.domain.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public ResponseEntity<List<Member>> findAllMembers() {
        return ResponseEntity.ok(memberService.findAll());
    }
}
