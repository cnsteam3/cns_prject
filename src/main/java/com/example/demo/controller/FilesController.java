package com.example.demo.controller;

import com.example.demo.service.FilesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FilesController {
    private final FilesService filesService;
}
