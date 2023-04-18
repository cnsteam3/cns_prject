package com.example.demo.controller;

import com.example.demo.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReplyController {
    private final ReplyService replyService;
}
