package com.example.demo.service;

import com.example.demo.repository.FilesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FilesService {
    private final FilesRepository filesRepository;
}
