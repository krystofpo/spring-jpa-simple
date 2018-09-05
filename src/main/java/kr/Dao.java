package kr;

import org.springframework.stereotype.Component;

@Component
public class Dao {
    public void vypis() {
        System.out.println("v poradku");
    }

    public String zk() {
        return "ok";
    }
}
