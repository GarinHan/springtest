package com.springmvc.web;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

public class SpringFilter implements Filter {
    private String paramtest = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        paramtest = filterConfig.getInitParameter("paramtest");
        System.out.println("paramtest:"+paramtest);//输出初始化的参数
    }

    public void destroy() {
        System.out.println("过滤器被注销");

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //获取客户机的IP地址
        String ipAddress = request.getRemoteAddr();

        //记录IP地址和当前时间戳
        System.out.println("客户机的ip地址是"+ipAddress + ", Time"+ new Date().toString());

        //把请求传回过滤链
        chain.doFilter(request, response);

    }
}
