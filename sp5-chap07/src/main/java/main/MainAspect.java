package main;

import chap07.RecCalculator;
import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspect {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        RecCalculator cal = ctx.getBean("calculator", RecCalculator.class);
        long five = cal.factorial(5);
        System.out.println("cal.factorial(5) = " + five);
        System.out.println(cal.getClass().getName());
        ctx.close();
    }
}
