package kr.persistence;

import kr.entity.Clovek;

public interface DaoRealneI {

    void addClovek(Clovek clovek);

    Clovek getClovekById(long id);

    void saveClovek(Clovek clovek);
}
