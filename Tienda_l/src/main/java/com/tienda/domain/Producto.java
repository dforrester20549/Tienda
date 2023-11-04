package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
//Serializacion va almacenar datos de la bd
public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L; //Para poder hacer el cilo de la sumatoria de la categorio (AUTO_INCREMENT)
    
    @Id //Id es la llave de la tabla producto
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
//    private long idCategoria;
    private String detalle;
    private int existencias;
    private double precio;

    @OneToMany
    @JoinColumn(name = "id_categoria")
    List<Producto> productos;
    public Producto() {
    }

    public Producto(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
