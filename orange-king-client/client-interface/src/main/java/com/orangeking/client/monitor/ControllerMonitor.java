package com.orangeking.client.dao.monitor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * Created by Yashon on 2017/2/28.
 */
@Aspect
@Component
public class ControllerMonitor {
    private Logger logger= LoggerFactory.getLogger(ControllerMonitor.class);
    @Around("execution(* com.orangeking.king.client.controller.*Controller.*(..))")
    public Object logAroundController(ProceedingJoinPoint jp)throws Throwable {
        logger.info("===========================Around Start=================================");
        Object rvt = null;
        long startTime = System.currentTimeMillis();
        String methodInfo = jp.getTarget().getClass().getSimpleName() + "."
                + jp.getSignature().getName();
//        String paramInfo = JSON.toJSONString(jp.getArgs());
        logger.info("{\"Controller_method_start\":{},\"params:\"{}}",
                methodInfo, Arrays.toString(jp.getArgs()));

        rvt =jp.proceed();
        long endTime = System.currentTimeMillis();
        String returnInfo = rvt.toString();
        long time = endTime - startTime;
        logger.info(
                "{\"Controller_method_end\":{},\"returnData:\"{},\"duration\":{}}",
                methodInfo, returnInfo, time);
        logger.debug("===========================Around End=================================");
        return rvt;
    }
    /*@AfterReturning("execution(* com.example..*Service.*(..))")
    public void logAfterService(JoinPoint joinPoint){
        logger.info("===========================After Start=================================");
        String methodInfo = joinPoint.getTarget().getClass().getSimpleName() + "."
                + joinPoint.getSignature().getName();
        String paramInfo = Arrays.toString(joinPoint.getArgs());
        logger.info("{\"Controller_method_end\":{},\"params:\"{}}",
                methodInfo, paramInfo);
        logger.info("===========================After End=================================");
    }

    @Before("execution(* com.example..*Service.*(..))")
    public void logBeforeService(JoinPoint joinPoint){
        logger.info("===========================Before Start=================================");
        String methodInfo = joinPoint.getTarget().getClass().getSimpleName() + "."
                + joinPoint.getSignature().getName();
        String paramInfo = Arrays.toString(joinPoint.getArgs());
        logger.info("{\"Controller_method_start\":{},\"params:\"{}}",
                methodInfo, paramInfo);
        logger.info("===========================Before End=================================");
    }*/

}
