package com.gestionvol.demo.ServicesImp;

import com.gestionvol.demo.Services.VolService;
import com.gestionvol.demo.entity.Vol;
import com.gestionvol.demo.repository.VolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolServiceImp implements VolService {

    private final VolRepository volRepository ;

    public VolServiceImp(VolRepository volRepository) {
        this.volRepository = volRepository;
    }
    
    @Override
    public Vol save(Vol vol) {
        return volRepository.save(vol);
    }

    @Override
    public Vol update(Vol vol, long id) {

        Vol volFind = volRepository.findById(id).orElse(null);
        volFind.setDepart(vol.getDepart());
        volFind.setArrivee(vol.getArrivee());
        volFind.setDateDepart(vol.getDateDepart());
        volFind.setDateArrivee(vol.getDateArrivee());
        Vol update = volRepository.save(volFind);
        return update;
    }

    @Override
    public List<Vol> findAll() {
        return volRepository.findAll();
    }

    @Override
    public void delete(long id){
        Vol volFind = volRepository.findById(id).orElse(null);
        volRepository.deleteById(volFind.getId());
    }

    @Override
    public Vol findById(long id) {
        Vol volFind = volRepository.findById(id).orElse(null);
        return volFind;
    }
}
