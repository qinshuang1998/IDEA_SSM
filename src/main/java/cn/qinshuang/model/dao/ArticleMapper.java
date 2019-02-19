package cn.qinshuang.model.dao;

import cn.qinshuang.model.entity.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(String sid);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}