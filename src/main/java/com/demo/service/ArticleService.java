package com.demo.service;

import com.demo.model.Article;
import com.demo.model.Files;
import com.demo.repository.ArticleRepository;
import com.demo.repository.FilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private FilesRepository filesRepository;


    public Article addArticle(Article article) {

        Article articleToSave = new Article();

        articleToSave.setContent(article.getContent());

        articleToSave = articleRepository.save(articleToSave);

        Files files = article.getFiles();

        files.setArticle(articleToSave);

        filesRepository.save(files);

        return articleToSave;

    }

    public List<Article> getAll() {

        List<Article> articles = articleRepository.findAll();

        return articles;
    }
}
