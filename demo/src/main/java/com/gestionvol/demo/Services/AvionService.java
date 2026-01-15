package com.gestionvol.demo.Services;

import com.gestionvol.demo.entity.Avion;

import java.util.List;

public interface AvionService {
    Avion save (Avion avion);

    Avion update(Avion avion, long id);

    List<Avion> findAll();

    void delete(long id);

    Avion findById(long id);

}
