package com.using.mongo.conntest;

import com.using.mongo.first.domain.Member_info;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepositoryBase extends MongoRepository<Member_info, String> {
}
