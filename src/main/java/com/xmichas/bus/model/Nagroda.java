package com.xmichas.bus.model;


import javax.persistence.*;

@Entity
@Table(name = "nagroda")
public class Nagroda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long nagrodaId;

    private String nazwa;
    private int iloscPunktow;

    public Long getNagrodaId() {
        return nagrodaId;
    }

    public void setNagrodaId(Long nagrodaId) {
        this.nagrodaId = nagrodaId;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIloscPunktow() {
        return iloscPunktow;
    }

    public void setIloscPunktow(int iloscPunktow) {
        this.iloscPunktow = iloscPunktow;
    }
}
