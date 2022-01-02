package com.demo.controller;

import com.demo.model.Files;
import com.demo.repository.FilesRepository;
import com.demo.service.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/files")
public class FilesController {

    @Autowired
    private FilesService filesService;

    @GetMapping
    public List<Files> getAll() {

        return filesService.getAll();
    }
}
