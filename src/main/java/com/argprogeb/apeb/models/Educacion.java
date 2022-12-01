package com.argprogeb.apeb.models;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private int fechaEdu;
    private String descEdu;
    private String imagenEdu;

    public Educacion() {
        this.idEdu = idEdu;
    }
        public Educacion(Long idEu, String tituloEdu, int fechaEdu, String descEdu, String imageEdu) {
            this.idEdu =idEdu;
            this.tituloEdu = tituloEdu;
            this.fechaEdu =fechaEdu;
            this.descEdu =descEdu;
        }


}
