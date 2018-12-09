package cn.qinshuang.controller;

import cn.qinshuang.model.entity.Article;
import cn.qinshuang.model.impl.ArticleImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private ArticleImpl articleImpl;

    @RequestMapping("/show.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String userId = request.getParameter("id");
        Article user = this.articleImpl.selectByPrimaryKey(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }
}
