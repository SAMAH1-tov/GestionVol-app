package com.gestionvol.demo.repository;

import com.gestionvol.demo.entity.Aeroport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeroportRepository extends JpaRepository<Aeroport, Long> {
}
