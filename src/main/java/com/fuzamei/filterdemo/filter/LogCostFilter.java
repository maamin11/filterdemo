package com.fuzamei.filterdemo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @program: filterdemo
 * @description: 过滤器
 * @author: Andy
 * @create: 2018-10-31 14:39
 **/
public class LogCostFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(LogCostFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info(">>>>>>>LogCostFilter init>>>>>>>>>>>>>");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info(">>>>>>>>>>>>LogCostFilter doFilter>>>>>>>>>>>");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        logger.info(">>>>>>>>>>>LogCostFilter destroy>>>>>>>>>>>>");

    }
}
