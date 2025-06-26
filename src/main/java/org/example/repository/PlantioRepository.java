package org.example.repository;

import org.example.model.Plantio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantioRepository extends JpaRepository<Plantio, Long> {
}
