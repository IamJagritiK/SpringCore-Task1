package com.stackroute;


import com.stackroute.domain.Movie;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class Main {
  public static void main(String[] args)
  {

      XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("beans.xml"));
      Movie movieFirst= (Movie)xmlBeanFactory.getBean("movie1");


      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
       Movie movie=(Movie)applicationContext.getBean("movie2");

       BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
       XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
       reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
       Movie movieReg= (Movie) ((DefaultListableBeanFactory)(beanDefinitionRegistry)).getBean("movie2");
       System.out.println(movieReg);
       

      System.out.println(movieFirst.getActor());
      System.out.println(movie.getActor());
      System.out.println(movieReg.getActor());

     
  }
}
