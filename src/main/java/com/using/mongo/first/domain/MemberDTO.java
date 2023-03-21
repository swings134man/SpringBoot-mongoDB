package com.using.mongo.first.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/************
 * @info : MongoDB Test를 위한 Req/Res DTO
 * @name : MemberDTO
 * @date : 2023/03/22 2:10 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {

    private String _id;
    private String name;
    private Integer age;
    private String email;

    public Member_info toEntity () {
        Member_info member = new Member_info();
        member.setName(name);
        member.setAge(age);
        member.setEmail(email);
        return member;
    }
}
