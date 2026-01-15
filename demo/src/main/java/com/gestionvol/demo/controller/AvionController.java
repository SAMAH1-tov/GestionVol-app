package com.gestionvol.demo.controller;

import com.gestionvol.demo.Services.AvionService;
import com.gestionvol.demo.entity.Avion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/avions/")
public class AvionController {
    private final AvionService avionService;

    public AvionController(AvionService avionService) {
        this.avionService = avionService;
    }

    @PostMapping("save")
    public ResponseEntity<Avion> create(@RequestBody Avion avion) {
        Avion saved = avionService.save(avion);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("findAll")
    public List<Avion> list() {
        return avionService.findAll();
    }


    @PutMapping("update/{id}")
    public  ResponseEntity<Avion> update(@PathVariable ("id") long id,
                                         @RequestBody Avion avion)
    {
        Avion update = avionService.update(avion,id);
        return ResponseEntity.status(HttpStatus.CREATED).body(update);

    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable ("id") long id){
        avionService.delete(id);
    }

    @GetMapping("findById/{id}")
    public ResponseEntity getById(@PathVariable ("id") long id){
        Avion avionFind = avionService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(avionFind);
    }

}

