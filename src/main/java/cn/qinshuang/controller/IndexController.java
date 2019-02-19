package cn.qinshuang.controller;

import cn.qinshuang.model.entity.Article;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/show.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String userId = request.getParameter("id");
        Article user = new Article();
        user.setTitle("test");
        response.getWriter().write(JSON.toJSONString(user));
        response.getWriter().close();
    }
}
