package com.gestionvol.demo.repository;

import com.gestionvol.demo.entity.Vol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolRepository extends JpaRepository<Vol, Long> {
}

