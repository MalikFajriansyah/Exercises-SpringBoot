package com.latihan.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_travel")
public class Travel {
	
	@Id
	@Column(name = "id_travel", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_travel;
	
	@Column(name = "nama_supir")
	private String namaSupir;
	
	@Column(name = "no_telp")
	private String noTelpSupir;
	
	@Column(name = "alamat")
	private String alamat;
	
	@Column(name = "no_polisi")
	private String noPol;
	
	public int getIdTravel() {
		return id_travel;
	}
	public void setIdTravel(int idTravel) {
		this.id_travel = idTravel;
	}
	
	public String getNamaSupir() {
		return namaSupir;
	}
	public void setNamaSupir(String nama) {
		this.namaSupir = nama;
	}
	
	public String getNoTelpSupir() {
		return noTelpSupir;
	}
	public void setNoTelpSupir(String noTelpSupir) {
		this.noTelpSupir = noTelpSupir;
	}
	
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public String getNoPol() {
		return noPol;
	}
	public void setNoPol(String noPolisi) {
		this.noPol = noPolisi;
	}
}
