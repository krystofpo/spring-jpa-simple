package kr;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Hlavni {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Ovladac o = context.getBean(Ovladac.class);
        System.out.println(o.zkouska());
    }
}
