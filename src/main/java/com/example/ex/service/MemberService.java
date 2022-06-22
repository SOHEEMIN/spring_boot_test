package com.example.ex.service;

import com.example.ex.dto.MemberDTO;
import com.example.ex.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    public final MemberRepository memberRepository;

//    public Long save(MemberDTO memberDTO) {
//
//
//    }
}
