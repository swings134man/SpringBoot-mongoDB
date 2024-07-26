package com.using.mongo;

import com.mongodb.MongoClientSettings;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableReactiveMongoRepositories
public class MongoApplication extends AbstractReactiveMongoConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(MongoApplication.class, args);
    }


    @Override
    protected String getDatabaseName() {
        return "test";
    }


    // TODO: 별도의 Configuration 파일로 분리
    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create(MongoClientSettings.builder()
                .applyConnectionString(new com.mongodb.ConnectionString("mongodb://test1:test1234@192.168.35.135:17017/test?authSource=admin&authMechanism=SCRAM-SHA-1"))
                .build());
    }
}
