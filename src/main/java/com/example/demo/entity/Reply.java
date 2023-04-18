package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String replyContent;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}


/*
* 날자 베이스엔
* ip는 유저에서
*/
