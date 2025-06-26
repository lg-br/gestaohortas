package org.example.controller;

import org.example.model.Plantio;
import org.example.repository.PlantioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plantios")
public class PlantioController {

    private final PlantioRepository repository;

    public PlantioController(PlantioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Plantio> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Plantio buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Plantio não encontrado"));
    }

    @PostMapping
    public Plantio criar(@RequestBody Plantio plantio) {
        return repository.save(plantio);
    }

    @PutMapping("/{id}")
    public Plantio atualizar(@PathVariable Long id, @RequestBody Plantio plantio) {
        plantio.setId(id);
        return repository.save(plantio);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
