package com.using.mongo.conntest;

import com.using.mongo.first.domain.MemberDTO;
import com.using.mongo.first.domain.Member_info;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/member")
public class MemberControllerBase {

    private final MemberRepositoryBase memberRepositoryBase;

    @GetMapping("/info")
    public List<Member_info> getMemberInfo() {
        return memberRepositoryBase.findAll();
    }

    @PostMapping("/info")
    public void saveMember(@RequestBody MemberDTO dto) {
        Member_info entity = dto.toEntity();
        memberRepositoryBase.save(entity);
    }

}
