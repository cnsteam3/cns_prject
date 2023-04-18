package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Files extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String accept;
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
