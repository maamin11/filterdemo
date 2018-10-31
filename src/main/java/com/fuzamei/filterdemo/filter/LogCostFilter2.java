package com.fuzamei.filterdemo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @program: filterdemo
 * @description: 第二个过滤器
 * 该过滤器用注解的方式来配置
 * @author: Andy
 * @create: 2018-10-31 15:02
 **/
@WebFilter(filterName = "LogCostFilter2",urlPatterns = "/*")
public class LogCostFilter2 implements Filter {

    private Logger logger = LoggerFactory.getLogger(LogCostFilter2.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info(">>>>>>>>>>>>>>LogCostFilter2 init>>>>>>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info(">>>>>>>>>>>LogCostFilter2 doFilter>>>>>>>>>>>>>>>>");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
