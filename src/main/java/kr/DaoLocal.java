package kr;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local")
public class DaoLocal implements DaoI {

    @Override
    public String zk() {
        return "ok local";
    }
}
