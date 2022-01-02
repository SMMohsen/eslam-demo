package com.demo.controller;

import com.demo.model.Article;
import com.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Article addArticle(@RequestBody Article article) {


        return articleService.addArticle(article);
    }

    @GetMapping
    public List<Article> getAll() {

        return articleService.getAll();
    }
}
