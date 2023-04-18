package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Member extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="member_passwd")
    private String passwd;
    private String passwdCheck;
    private String email;
    private String nickname;
    private String phone;
    private String userIp;
    private String tempPwd;
    private String aptName;
    private String aptDetail;
    @OneToOne(mappedBy = "member")
    private Files files;
    @OneToMany(mappedBy = "member")
    private List<Reply> replies;
}

/*

날짜 BaseEntity
passwdCheck 빼기
사용 가능한 옵션들
@Column(name = "컬럼명")
해당 필드를 데이터베이스에서 사용할 컬럼명을 설정할 수 있습니다.
@GeneratedValue(strategy = GenerationType.XXX)
데이터베이스에서 해당 필드의 값을 자동으로 생성할 때 사용하는 전략을 설정합니다. GenerationType.AUTO는 자동으로 생성 전략을 선택하도록 합니다.
@Lob
해당 필드가 LOB (Large Object) 컬럼임을 지정합니다. 문자열이나 바이트 배열 등을 저장할 수 있습니다.
@Temporal(TemporalType.XXX)
날짜와 시간을 저장할 필드에서 사용합니다. TemporalType.DATE, TemporalType.TIME, TemporalType.TIMESTAMP 중 하나를 선택하여 시간의 정밀도를 설정합니다.
@Column(nullable = false)
해당 필드가 NULL 값을 허용하지 않도록 설정합니다.
@Column(unique = true)
해당 필드의 값이 유일해야 함을 설정합니다.
@Column(length = XXX)
해당 필드의 최대 길이를 설정합니다.
@Column(precision = XXX, scale = YYY)
해당 필드가 소수점을 포함하는 숫자인 경우, 정밀도(precision)와 소수점 이하 자릿수(scale)를 설정합니다.*/
