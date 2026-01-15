package com.gestionvol.demo.ServicesImp;

import com.gestionvol.demo.Services.AeroportService;
import com.gestionvol.demo.entity.Aeroport;
import com.gestionvol.demo.repository.AeroportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AeroportServiceImp implements AeroportService {
    private final AeroportRepository aeroportRepository;

    public AeroportServiceImp(AeroportRepository aeroportRepository) {
        this.aeroportRepository = aeroportRepository;
    }

    @Override
    public Aeroport save(Aeroport aeroport) {
        Aeroport saved = aeroportRepository.save(aeroport);
        return saved;
    }

    @Override
    public Aeroport update(Aeroport aeroport, long id) {
        Aeroport aeroportFind = aeroportRepository.findById(id).orElse(null);
        aeroportFind.setCode(aeroport.getCode());
        aeroportFind.setNom(aeroport.getNom());
        aeroportFind.setVille(aeroport.getVille());
        aeroportFind.setPays(aeroport.getPays());

        Aeroport update = aeroportRepository.save(aeroportFind);
        return update;
    }

    @Override
    public List<Aeroport> findAll() {
        return aeroportRepository.findAll();
    }

    @Override
    public void delete(long id) {
        Aeroport aeroportFind = aeroportRepository.findById(id).orElse(null);
        aeroportRepository.deleteById(aeroportFind.getId());
    }

    @Override
    public Aeroport findById(long id) {
        Aeroport aeroportFind = aeroportRepository.findById(id).orElse(null);
        return null;
    }

}
