package com.using.mongo.conntest.maria;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.using.mongo.config.BaseTimeEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "board")
public class Board extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    private String title; //제목
    @Column(columnDefinition = "TEXT")
    private String content; // 내용
    private String writer; //작성자 ID
}

