package kr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ovladac {
    private DaoI dao;

    @Autowired
    public Ovladac(DaoI dao) {
        this.dao = dao;
    }

    public String zkouska() {
        return dao.zk();
    }
}
