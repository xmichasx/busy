package com.xmichas.bus.model;

import javax.persistence.*;

@Entity
@Table(name = "pojazd")
public class Pojazd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long pojazdId;

    private String marka;
    private String model;
    private String tablica;
    private double spalanie;
    private int iloscMiejsc;

    public Long getPojazdId() {
        return pojazdId;
    }

    public void setPojazdId(Long pojazdId) {
        this.pojazdId = pojazdId;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTablica() {
        return tablica;
    }

    public void setTablica(String tablica) {
        this.tablica = tablica;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }
}
