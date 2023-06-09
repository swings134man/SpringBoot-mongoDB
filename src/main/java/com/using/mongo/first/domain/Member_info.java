package com.using.mongo.first.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/************
 * @info : MomgoDB - Entity
 * @name : member_info
 * @date : 2023/03/22 2:04 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
@Document(collection = "member_info")
@NoArgsConstructor
@Data
public class Member_info {

    @Id
    private String _id;

    private String name;
    private Integer age;
    private String email;
}
