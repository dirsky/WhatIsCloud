package com.frank.cloud.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Guozhong Xu
 * @version 1.0
 * @date Create in 13:53 2020/2/6
 */
@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");

        System.out.print("token: ");
        System.out.println(token);


        if ("frank".equals(token)) {
            return null;
        }
        context.setSendZuulResponse(false);
        context.setResponseStatusCode(401);


        try {
            context.getResponse().getWriter().write("token is wrong");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("hello - run - end");
        return null;
    }
}
