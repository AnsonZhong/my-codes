package top.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.spring.ioc.bean.Master;

public class Demo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-aop.xml");

        Master master = context.getBean("master",Master.class);
        master.play();
    }
}
