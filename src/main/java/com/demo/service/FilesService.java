package com.demo.service;

import com.demo.model.Files;
import com.demo.repository.FilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilesService {

    @Autowired
    private FilesRepository filesRepository;

    public List<Files> getAll() {

        return filesRepository.findAll();
    }
}
