package com.gestionvol.demo.repository;

import com.gestionvol.demo.entity.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvionRepository extends JpaRepository<Avion, Long> {

}

