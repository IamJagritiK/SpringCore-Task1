package com.stackroute.demo;import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
public class BeanPostProcessorDemoBean implements BeanPostProcessor {
   @Override
   public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
       System.out.println("initialized");
       return bean;
   }    @Override
   public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
       System.out.println("after");
       return bean;
   }
}