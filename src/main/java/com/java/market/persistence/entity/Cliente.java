package com.java.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    private String id;
    private String nombre;
    private String apellidos;

    private Double celular;

    private Double direccion;

    @Column(name = "correo_electronico")
    private Boolean email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getCelular() {
        return celular;
    }

    public void setCelular(Double celular) {
        this.celular = celular;
    }

    public Double getDireccion() {
        return direccion;
    }

    public void setDireccion(Double direccion) {
        this.direccion = direccion;
    }

    public Boolean getEmail() {
        return email;
    }

    public void setEmail(Boolean email) {
        this.email = email;
    }
}
