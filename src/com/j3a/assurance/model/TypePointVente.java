package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TypePointVente generated by hbm2java
 */
@Entity
@Table(name = "type_point_vente", catalog = "zeusbd")
public class TypePointVente implements java.io.Serializable {

	private int codeTypePointVente;
	private String libelleTypePointVente;
	private Set<PointVente> pointVentes = new HashSet<PointVente>(0);

	public TypePointVente() {
	}

	public TypePointVente(int codeTypePointVente) {
		this.codeTypePointVente = codeTypePointVente;
	}

	public TypePointVente(int codeTypePointVente, String libelleTypePointVente,
			Set<PointVente> pointVentes) {
		this.codeTypePointVente = codeTypePointVente;
		this.libelleTypePointVente = libelleTypePointVente;
		this.pointVentes = pointVentes;
	}

	@Id
	@Column(name = "CODE_TYPE_POINT_VENTE", unique = true, nullable = false)
	public int getCodeTypePointVente() {
		return this.codeTypePointVente;
	}

	public void setCodeTypePointVente(int codeTypePointVente) {
		this.codeTypePointVente = codeTypePointVente;
	}

	@Column(name = "LIBELLE_TYPE_POINT_VENTE", length = 20)
	public String getLibelleTypePointVente() {
		return this.libelleTypePointVente;
	}

	public void setLibelleTypePointVente(String libelleTypePointVente) {
		this.libelleTypePointVente = libelleTypePointVente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typePointVente")
	public Set<PointVente> getPointVentes() {
		return this.pointVentes;
	}

	public void setPointVentes(Set<PointVente> pointVentes) {
		this.pointVentes = pointVentes;
	}

}
