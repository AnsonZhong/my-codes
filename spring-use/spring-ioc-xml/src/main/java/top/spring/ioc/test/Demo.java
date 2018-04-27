package top.spring.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.spring.ioc.bean.Zoo;
import top.spring.ioc.bean.Master;

public class Demo {

    public static void main(String[] args) {
        visitHouse();

        visitZoo();
    }

    public static void visitHouse(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-ioc.xml");

        Master master = context.getBean("master",Master.class);
        master.play();
    }

    public static void visitZoo(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Zoo.class);
        Master master = context.getBean("master",Master.class);
        master.play();
    }

}