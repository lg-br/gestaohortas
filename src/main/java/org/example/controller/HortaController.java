package org.example.controller;

import org.example.model.Horta;
import org.example.repository.HortaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hortas")
public class HortaController {

    private final HortaRepository repository;

    public HortaController(HortaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Horta> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Horta buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Horta não encontrada"));
    }

    @PostMapping
    public Horta criar(@RequestBody Horta horta) {
        return repository.save(horta);
    }

    @PutMapping("/{id}")
    public Horta atualizar(@PathVariable Long id, @RequestBody Horta horta) {
        horta.setId(id);
        return repository.save(horta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}