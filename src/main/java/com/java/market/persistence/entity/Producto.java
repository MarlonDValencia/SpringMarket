package com.java.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private String id;

    private String nombre;
    @Column(name = "id_categoria")
    private String idCategoria;

    @Column(name = "precioVenta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Double cantidadStock;

    @Column(name = "estado")
    private Boolean status;

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

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Double cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
