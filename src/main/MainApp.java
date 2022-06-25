package main;

import converter.HexadecimalC;
import converter.BinaryC;
import manager.Manager;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:META-INF/beans.xml");
        BeanFactory factory = context;
        Manager Manager = (Manager) factory.getBean("converterManager");
        Manager.run();
    }
}
