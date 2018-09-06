package kr;

import kr.entity.Clovek;
import kr.persistence.DaoRealneI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Program {

    public DaoRealneI dao;

    @Autowired
    public Program(DaoRealneI dao) {
        this.dao = dao;
    }

    @Transactional
    public String vytvorCloveka() {
        Clovek clovek = new Clovek();
clovek.name = "kr";
        dao.addClovek(clovek);
        clovek = null;
        clovek = dao.getClovekById(1L);
        return  clovek.name;
    }
}
