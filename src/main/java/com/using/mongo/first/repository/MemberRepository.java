package com.using.mongo.first.repository;

import com.using.mongo.first.domain.Member_info;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/************
 * @info : MongoDB Test Repository
 * @name : MemberRepository
 * @date : 2023/03/22 2:08 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
@Repository
public interface MemberRepository extends ReactiveMongoRepository<Member_info, String> {

//    List<Member_info> findByEmailContains(String keyWord);

}
