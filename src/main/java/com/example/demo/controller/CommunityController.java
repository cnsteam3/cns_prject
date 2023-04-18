package com.example.demo.controller;

import com.example.demo.service.BoardService;
import com.example.demo.service.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommunityController {
    private final CommunityService communityService;
}
