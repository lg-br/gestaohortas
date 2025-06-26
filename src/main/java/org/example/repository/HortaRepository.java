package org.example.repository;

import org.example.model.Horta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HortaRepository extends JpaRepository<Horta, Long> {
}
