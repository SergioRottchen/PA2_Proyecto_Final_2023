/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author sirgi
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Almacen implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @OneToOne
    @JoinColumn(name = "ubicacion_id")
    private Direccion ubicacion;
    @OneToMany(mappedBy = "unAlmacen")
    private List<Proveedor> proveedores;
    @OneToMany(mappedBy = "ubicacion")
    private List<Paquete> paquetes;

    public Almacen() {
    }

    public Almacen(int id, String nombre, Direccion ubicacion, List<Proveedor> proveedores, List<Paquete> paquetes) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.proveedores = proveedores;
        this.paquetes = paquetes;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Direccion ubicacion) {
        this.ubicacion = ubicacion;
    }

}
