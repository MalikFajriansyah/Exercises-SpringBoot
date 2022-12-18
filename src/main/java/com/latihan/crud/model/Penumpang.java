package com.latihan.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_penumpang")
public class Penumpang {
	
	@Id
	@Column(name = "id_penumpang", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_penumpang;
	
	@Column(name = "nama")
	private String nama;
	
	@Column(name = "no_telp")
	private String no_telp;
	
	@Column(name = "alamat")
	private String alamat;
	
	public int getIdPenumpang() {
		return id_penumpang;
	}
	public void setIdPenumoang(int id_penumpang){
		this.id_penumpang = id_penumpang;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNoTelpPnp() {
		return no_telp;
	}
	public void setNoTelpPnp(String no_telp) {
		this.no_telp = no_telp;
	}
	
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
}
