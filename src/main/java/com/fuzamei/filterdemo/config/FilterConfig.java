package com.fuzamei.filterdemo.config;

import com.fuzamei.filterdemo.filter.LogCostFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: filterdemo
 * @description: 过滤器
 * @author: Andy
 * @create: 2018-10-31 14:33
 **/
@Configuration
public class FilterConfig {
    private Logger logger = LoggerFactory.getLogger(FilterConfig.class);

    @Bean
    public FilterRegistrationBean registFilter() {
        logger.info(">>>>>>>>>>>FilterConfig registFilter>>>>>>>>>>>>>>>>");
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogCostFilter());
        filterRegistrationBean.addUrlPatterns("/say");
        filterRegistrationBean.setName("LogCostFilter");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

}
