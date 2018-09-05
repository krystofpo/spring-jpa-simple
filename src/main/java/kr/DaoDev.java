package kr;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DaoDev implements DaoI {

    @Override
    public String zk() {
        return "ok dev";
    }
}
