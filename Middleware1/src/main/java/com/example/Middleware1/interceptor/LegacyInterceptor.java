package com.example.Middleware1.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;

public class LegacyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().contains("/legacy")) {
            response.setStatus(HttpStatus.GONE.value());
            response.getWriter().write("This resource is no longer available.");
            return false;
        }
        return true;
    }
}
