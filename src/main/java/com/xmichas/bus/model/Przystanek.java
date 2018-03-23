package com.xmichas.bus.model;

import javax.persistence.*;

@Entity
@Table(name = "przystanek")
public class Przystanek {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long przystanekId;

    private String Nazwa;

    public Long getPrzystanekId() {
        return przystanekId;
    }

    public void setPrzystanekId(Long przystanekId) {
        this.przystanekId = przystanekId;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }
}
