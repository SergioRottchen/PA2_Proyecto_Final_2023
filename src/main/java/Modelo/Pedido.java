/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long costo;
    //estadeoCosto refleja si esta pagado el pedido o no
    private boolean estadoCosto;
    private String descripcion;
    
    private LocalDate fechaPedido;
    @ManyToOne
    @JoinColumn(name = "cliente_Remitente_id")
    private Cliente clienteRemitente;
    @ManyToOne
    @JoinColumn(name = "cliente_Destinatario_id")
    private Cliente clientedestinatario;
    @ManyToOne
    @JoinColumn(name = "estado_pedido_id")
    private EstadoDelPedido estado;
    @ManyToOne
    @JoinColumn(name = "Documento_Transporte_id")
    private DocumentoTransporte unDocumento;
    @OneToOne
    @JoinColumn(name = "unPaquete_id")
    private Paquete paquetes;
    @OneToOne
    @JoinColumn(name = "direccionOrigen_id")
    private Direccion origen;
    @OneToOne
    @JoinColumn(name = "direccionDestino_id")
    private Direccion destino;

    public Pedido() {
    }

    public Pedido(int id, long costo, boolean estadoCosto, String descripcion, LocalDate fechaPedido, Cliente clienteRemitente, Cliente clientedestinatario, EstadoDelPedido estado, DocumentoTransporte unDocumento, Paquete paquetes, Direccion origen, Direccion destino) {
        this.id = id;
        this.costo = costo;
        this.estadoCosto = estadoCosto;
        this.descripcion = descripcion;
        this.fechaPedido = fechaPedido;
        this.clienteRemitente = clienteRemitente;
        this.clientedestinatario = clientedestinatario;
        this.estado = estado;
        this.unDocumento = unDocumento;
        this.paquetes = paquetes;
        this.origen = origen;
        this.destino = destino;
    }

    public Pedido(String precio, boolean estadoCosto, String descripcion, LocalDate localDate, Cliente idRemitente, Cliente idDestinatario, EstadoDelPedido idEstadoPedido, Direccion idOrigen, Direccion idDestino) {

        this.costo = Integer.parseInt(precio);
        this.estadoCosto=estadoCosto;
        this.descripcion = descripcion;
        this.fechaPedido = localDate;
        this.clienteRemitente=idRemitente;
        this.clientedestinatario=idDestinatario;
        this.estado=idEstadoPedido;
        this.origen=idOrigen;
        this.destino=idDestino;
    }

    public boolean isEstadoCosto() {
        return estadoCosto;
    }

    public void setEstadoCosto(boolean estadoCosto) {
        this.estadoCosto = estadoCosto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    public Direccion getOrigen() {
        return origen;
    }

    public void setOrigen(Direccion origen) {
        this.origen = origen;
    }

    public Direccion getDestino() {
        return destino;
    }

    public void setDestino(Direccion destino) {
        this.destino = destino;
    }

    

    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }

    

    public Cliente getClienteRemitente() {
        return clienteRemitente;
    }

    public void setClienteRemitente(Cliente clienteRemitente) {
        this.clienteRemitente = clienteRemitente;
    }

    public Cliente getClientedestinatario() {
        return clientedestinatario;
    }

    public void setClientedestinatario(Cliente clientedestinatario) {
        this.clientedestinatario = clientedestinatario;
    }

    public DocumentoTransporte getUnDocumento() {
        return unDocumento;
    }

    public void setUnDocumento(DocumentoTransporte unDocumento) {
        this.unDocumento = unDocumento;
    }

    public DocumentoTransporte getDocumentoTrasporte() {
        return unDocumento;
    }

    public void setDocumentoTrasporte(DocumentoTransporte documentoTrasporte) {
        this.unDocumento = documentoTrasporte;
    }

    public Paquete getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(Paquete paquetes) {
        this.paquetes = paquetes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Cliente getCliente() {
        return clienteRemitente;
    }

    public void setCliente(Cliente cliente) {
        this.clienteRemitente = cliente;
    }

    public EstadoDelPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoDelPedido estado) {
        this.estado = estado;
    }

}
