package org.example.itheimabigevent.service;


import org.example.itheimabigevent.pojo.Article;
import org.example.itheimabigevent.pojo.PageBean;

public interface ArticleService {
    //新增文章
    void add(Article article);

    //条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
