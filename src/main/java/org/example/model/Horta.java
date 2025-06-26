package org.example.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Horta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String localizacao;

    @OneToMany(mappedBy = "horta", cascade = CascadeType.ALL)
    private List<Plantio> plantios;

    public Horta() {
    }

    public Horta(Long id, String nome, String localizacao) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public List<Plantio> getPlantios() { return plantios; }
    public void setPlantios(List<Plantio> plantios) { this.plantios = plantios; }
}
