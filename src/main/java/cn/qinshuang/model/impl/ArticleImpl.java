package cn.qinshuang.model.impl;

import cn.qinshuang.model.dao.ArticleMapper;
import cn.qinshuang.model.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ArticleImpl")
public class ArticleImpl {
    @Autowired
    private ArticleMapper articleMapper;

    public Article selectByPrimaryKey(String sid){
        return this.articleMapper.selectByPrimaryKey(sid);
    }
}
