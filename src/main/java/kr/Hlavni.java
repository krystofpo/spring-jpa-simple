package kr;


import kr.entity.Clovek;
import kr.persistence.DaoRealneI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class Hlavni {

    //@Transactional
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Ovladac o = context.getBean(Ovladac.class);
        System.out.println(o.zkouska());
        Program p = context.getBean(Program.class);
        System.out.println(p.vytvorCloveka());

    }
}
