package com.xmichas.bus.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    private enum Stanowisko{KLIENT, PRACOWNIKSEKRETARIATU, KIEROWCA, SZEF}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long userId;

    private String imie;
    private String nazwisko;
    private String email;
    private String login;
    private String haslo;
    private int iloscPunktow;
    private Stanowisko stanowisko= Stanowisko.KLIENT;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public int getIloscPunktow() {
        return iloscPunktow;
    }

    public void setIloscPunktow(int iloscPunktow) {
        this.iloscPunktow = iloscPunktow;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    public User(String imie, String nazwisko, String email, String login, String haslo, int iloscPunktow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.login = login;
        this.haslo = haslo;
        this.iloscPunktow = iloscPunktow;
    }

    public User() {
    }
}
