package com.latihan.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_ticket")
public class Tiket {
	
	@Id
	@Column(name = "Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name = "id_penumpang")
	private int id_penumpang;
	
	@Column(name = "id_travel")
	private int id_travel;
	
	@Column(name = "jadwal")
	private String jadwal;
	
	//Join Column
	@ManyToOne(targetEntity = Penumpang.class)
	@JoinColumn(name = "Id", referencedColumnName = "id_penumpang", insertable = false, updatable = false)
	Penumpang penumpang;
	
	@ManyToOne(targetEntity = Travel.class)
	@JoinColumn(name = "Id", referencedColumnName = "id_travel", insertable = false, updatable = false)
	Travel travel;
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public int getIdPnp() {
		return id_penumpang;
	}
	public void setIdPnp(int idPnp) {
		this.id_penumpang = idPnp;
	}
	
	public int getIdTrvl() {
		return id_travel;
	}
	public void setIdTrvl(int idTrvl) {
		this.id_travel = idTrvl;
	}
	
	public String getJadwal() {
		return jadwal;
	}
	public void setJadwal(String jadwal) {
		this.jadwal = jadwal;
	}
}
