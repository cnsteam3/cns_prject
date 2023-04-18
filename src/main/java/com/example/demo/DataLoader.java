package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private CommunityRepository communityRepository;
    @Autowired
    private FilesRepository filesRepository;
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private ReplyRepository replyRepository;


    @Override
    public void run(String... args) throws Exception {

        // Member 데이터 생성
        Member member1 = new Member();
        member1.setPasswd("password1");
        member1.setPasswdCheck("password1");
        member1.setEmail("member1@example.com");
        member1.setNickname("Member1");
        member1.setPhone("123-456-7890");
        member1.setUserIp("192.168.0.1");
        member1.setTempPwd("tempPassword1");
        member1.setAptName("Apartment A");
        member1.setAptDetail("Building 1, Room 101");
        memberRepository.save(member1);

        Member member2 = new Member();
        member2.setPasswd("password2");
        member2.setPasswdCheck("password2");
        member2.setEmail("member2@example.com");
        member2.setNickname("Member2");
        member2.setPhone("123-456-7890");
        member2.setUserIp("192.168.0.2");
        member2.setTempPwd("tempPassword2");
        member2.setAptName("Apartment B");
        member2.setAptDetail("Building 2, Room 202");
        memberRepository.save(member2);

        // Board 데이터 생성
        Board board1 = new Board();
        board1.setTitle("First Board");
        board1.setContent("This is the first board.");
        board1.setThumb("thumb1.jpg");
        board1.setScr("scr1.jpg");
        board1.setCnt(10);
        board1.setStatus("active");
        boardRepository.save(board1);

        Board board2 = new Board();
        board2.setTitle("Second Board");
        board2.setContent("This is the second board.");
        board2.setThumb("thumb2.jpg");
        board2.setScr("scr2.jpg");
        board2.setCnt(20);
        board2.setStatus("inactive");
        boardRepository.save(board2);

        // Files 데이터 생성
        Files files1 = new Files();
        files1.setName("file1");
        files1.setAccept("pdf");
        files1.setMember(member1);
        filesRepository.save(files1);

        Files files2 = new Files();
        files2.setName("file2");
        files2.setAccept("jpg");
        files2.setMember(member2);
        filesRepository.save(files2);

        // Reply 데이터 생성
        Reply reply1 = new Reply();
        reply1.setReplyContent("reply content 1");
        reply1.setMember(member1);
        replyRepository.save(reply1);

        Reply reply2 = new Reply();
        reply2.setReplyContent("reply content 2");
        reply2.setMember(member2);
        replyRepository.save(reply2);

        Reply reply3 = new Reply();
        reply3.setReplyContent("reply content 3");
        reply3.setMember(member1);
        replyRepository.save(reply3);

        // Community 데이터 생성
        Community community1 = new Community();
        community1.setFac("Community Center A");
        community1.setResDate("2022-05-01");
        community1.setStartTime("10:00");
        community1.setEndTime("12:00");
        community1.setCntPerson(20);
        community1.setPayment("paid");
        community1.setEx("This is a community event.");
        communityRepository.save(community1);

        Community community2 = new Community();
        community2.setFac("Community Center B");
        community2.setResDate("2022-06-01");
        community2.setStartTime("14:00");
        community2.setEndTime("16:00");
        community2.setCntPerson(30);
        community2.setPayment("free");
        community2.setEx("This is another community event.");
        communityRepository.save(community2);
    }
}
