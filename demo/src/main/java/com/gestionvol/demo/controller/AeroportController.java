package com.gestionvol.demo.controller;

import com.gestionvol.demo.Services.AeroportService;
import com.gestionvol.demo.entity.Aeroport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aeroports/")
public class AeroportController {
    private final AeroportService aeroportService;

    public AeroportController(AeroportService aeroportService) {
        this.aeroportService = aeroportService;
    }

    @PostMapping("save")
    public ResponseEntity<Aeroport> create(@RequestBody Aeroport aeroport) {
        Aeroport saved = aeroportService.save(aeroport);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("findAll")
    public List<Aeroport> list() {
        return aeroportService.findAll();
    }

    @PutMapping("update/{id}")
    public  ResponseEntity<Aeroport> update(@PathVariable ("id") long id,
                                         @RequestBody Aeroport aeroport)
    {
        Aeroport update = aeroportService.update(aeroport,id);
        return ResponseEntity.status(HttpStatus.CREATED).body(update);
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable ("id") long id){
        aeroportService.delete(id);
    }
    @GetMapping("findById/{id}")
    public ResponseEntity getById(@PathVariable ("id") long id){
        Aeroport aeroportFind = aeroportService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(aeroportFind);
    }
}
