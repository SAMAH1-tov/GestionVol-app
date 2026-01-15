package com.gestionvol.demo.controller;
import com.gestionvol.demo.Services.VolService;
import com.gestionvol.demo.entity.Vol;
import com.gestionvol.demo.repository.VolRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vols/")
public class VolController {
    private final VolService volService;

    public VolController(VolService volService) {
        this.volService = volService;
    }


    @PostMapping("save")
    public ResponseEntity<Vol> create(@RequestBody Vol vol) {
        Vol saved = volService.save(vol);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("findAll")
    public List<Vol> list() {
        return volService.findAll();
    }


    @PutMapping("update/{id}")
    public  ResponseEntity<Vol> update(@PathVariable ("id") long id,
                                         @RequestBody Vol vol)
    {
        Vol update = volService.update(vol,id);
        return ResponseEntity.status(HttpStatus.CREATED).body(update);

    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable ("id") long id){
        volService.delete(id);
    }

    @GetMapping("findById/{id}")
    public ResponseEntity getById(@PathVariable ("id") long id){
        Vol volFind = volService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(volFind);
    }

}

