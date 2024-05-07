package com.example.Middleware2.interceptor;

import com.example.Middleware2.entity.MonthEntity;
import jakarta.annotation.Nullable;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    public static List<MonthEntity> months = new ArrayList<>(Arrays.asList(
            new MonthEntity(1, "January", "Gennaio", "Januar"),
            new MonthEntity(2, "February", "Febbraio", "Februar"),
            new MonthEntity(3, "March", "Marzo", "Marz"),
            new MonthEntity(4, "April", "Aprile", "April"),
            new MonthEntity(6, "May", "Maggio", "Mai"),
            new MonthEntity(5, "June", "Giugno", "Juni ")
    ));


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumber = request.getHeader("monthNumber");
        if (monthNumber == null || monthNumber.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "monthNumber header is required");
            return false;
        }

            for (MonthEntity m : months) {
                if (monthNumber.equals(m.getMonthNumber().toString())) {
                    request.setAttribute("selectedMonth", monthNumber);
                    response.setStatus(HttpServletResponse.SC_OK);
                    return true;
                }
            }
                MonthEntity emptyMonth = new MonthEntity();
                emptyMonth.setEnglishName("nope");
                emptyMonth.setItalianName("nope");
                emptyMonth.setGermanName("nope");
                request.setAttribute("selectedMonth", emptyMonth);
                response.setStatus(HttpServletResponse.SC_OK);
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex)  {
    }
}

