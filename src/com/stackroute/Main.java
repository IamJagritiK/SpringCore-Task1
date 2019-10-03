package com.stackroute;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class Main {
   public static void main( String[] args )
   {
       AbstractApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
       BeanLifecycleDemoBean appcontext= (BeanLifecycleDemoBean) context.getBean("Beanlifecycle");
       //System.out.println(appcontext);
       context.close();
       
      
}
}