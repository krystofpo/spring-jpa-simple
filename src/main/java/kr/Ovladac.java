package kr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ovladac {

    private Dao dao;

    public void zkouska() {
        dao.vypis();
    }

    public String zkouskaTest() {
        return dao.zk();
    }

    @Autowired
    public Ovladac(Dao dao) {
        this.dao = dao;
    }
}
