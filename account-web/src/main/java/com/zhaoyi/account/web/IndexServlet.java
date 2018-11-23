package com.zhaoyi.account.web;

import com.zhaoyi.account.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IndexServlet extends HttpServlet {

    private ApplicationContext ctx;

    @Override
    public void init() throws ServletException{
        super.init();
        ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println(id);

        AccountService service = (AccountService) ctx.getBean("accountService");
        service.send();
        service.store();
    }
}
