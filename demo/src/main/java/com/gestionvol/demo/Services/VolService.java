package com.gestionvol.demo.Services;

import com.gestionvol.demo.entity.Vol;

import java.util.List;

public interface VolService {
    Vol save (Vol vol);

    Vol update(Vol vol, long id);

    List<Vol> findAll();

    void delete(long id);

    Vol findById(long id);

}
