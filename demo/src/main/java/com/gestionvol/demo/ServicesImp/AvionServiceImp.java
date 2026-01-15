package com.gestionvol.demo.ServicesImp;

import com.gestionvol.demo.Services.AvionService;
import com.gestionvol.demo.entity.Avion;
import com.gestionvol.demo.repository.AvionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvionServiceImp implements AvionService {

    private final AvionRepository avionRepository ;

    public AvionServiceImp(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    @Override
    public Avion save(Avion avion) {
        return this.avionRepository.save(avion);
    }

    @Override
    public Avion update(Avion avion, long id) {

        Avion avionFind = avionRepository.findById(id).orElse(null);
        avionFind.setCode(avion.getCode());
        avionFind.setType(avion.getType());
        avionFind.setCapacite(avion.getCapacite());
        avionFind.setCompagnie(avion.getCompagnie());
        Avion update = avionRepository.save(avionFind);
        return update;

    }

    @Override
    public List<Avion> findAll() {
        return avionRepository.findAll();
    }

    @Override
    public void delete(long id){
        Avion avionFind = avionRepository.findById(id).orElse(null);
        avionRepository.deleteById(avionFind.getId());
    }

    @Override
    public Avion findById(long id) {
        Avion avionFind = avionRepository.findById(id).orElse(null);
        return avionFind;
    }
}
