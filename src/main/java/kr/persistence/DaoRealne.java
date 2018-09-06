package kr.persistence;


import kr.entity.Clovek;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class DaoRealne implements DaoRealneI{

    @PersistenceContext
    private EntityManager em;

    public void addClovek(Clovek clovek) {
        em.persist(clovek);
    }
    public Clovek getClovekById(long id) {
        return em.find(Clovek.class, id);
    }
    public void saveClovek(Clovek clovek) {
        em.merge(clovek);
    }

}




