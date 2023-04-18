package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Community extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fac;
    private String resDate;
    private String startTime;
    private String endTime;
    private int cntPerson;
    private String payment;
    private String ex;
}
