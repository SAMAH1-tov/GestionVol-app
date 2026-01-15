package com.gestionvol.demo.Services;

import com.gestionvol.demo.entity.Aeroport;

import java.util.List;

public interface AeroportService {
    Aeroport save (Aeroport aeroport);

    Aeroport update(Aeroport aeroport, long id);

    List<Aeroport> findAll();

    void delete(long id);

    Aeroport findById(long id);
}
