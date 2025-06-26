package org.example.model;

import jakarta.persistence.*;

@Entity
public class Plantio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cultura;
    private String dataPlantio;
    private String status;

    @ManyToOne
    @JoinColumn(name = "horta_id")
    private Horta horta;

    public Plantio() {
    }

    public Plantio(Long id, String cultura, String dataPlantio, String status, Horta horta) {
        this.id = id;
        this.cultura = cultura;
        this.dataPlantio = dataPlantio;
        this.status = status;
        this.horta = horta;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCultura() { return cultura; }
    public void setCultura(String cultura) { this.cultura = cultura; }

    public String getDataPlantio() { return dataPlantio; }
    public void setDataPlantio(String dataPlantio) { this.dataPlantio = dataPlantio; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Horta getHorta() { return horta; }
    public void setHorta(Horta horta) { this.horta = horta; }
}
