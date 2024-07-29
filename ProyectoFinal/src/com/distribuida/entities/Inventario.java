package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table (name = "inventario")
public class Inventario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_inventario")
	private int idInventario;
	@Column(name = "IdProducto")
	private int IdProducto;
	@Column(name = "IdBodega")
	private int IdBodega;
	@Column(name = "Cantidad")
	private String Cantidad;
	
	// @JoinColumn(name = "id_inventario")
	// @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
	// CascadeType.PERSIST, CascadeType.REFRESH})
	// private Inventario inventario;
 
	//
//    @JoinColumn(name = "IdProducto")
//	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
//    private Producto producto;
	
    public Inventario (){}
	public Inventario(int idInventario, int idProducto, int idBodega, String cantidad) {
		
		this.idInventario = idInventario;
		IdProducto = idProducto;
		IdBodega = idBodega;
		Cantidad = cantidad;	
		
	}
	public int getIdInventario() {
		return idInventario;
	}
	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}
	public int getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(int idProducto) {
		IdProducto = idProducto;
	}
	public int getIdBodega() {
		return IdBodega;
	}
	public void setIdBodega(int idBodega) {
		IdBodega = idBodega;
	}
	public String getCantidad() {
		return Cantidad;
	}
	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Inventario [idInventario=" + idInventario + ", IdProducto=" + IdProducto + ", IdBodega=" + IdBodega
				+ ", Cantidad=" + Cantidad + "]";
	}
	
	
	
}
