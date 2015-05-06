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
 * ActifsRepresentatifs generated by hbm2java
 */
@Entity
@Table(name = "actifs_representatifs", catalog = "zeusbd")
public class ActifsRepresentatifs implements java.io.Serializable {

	private String codeactifrep;
	private String libelleactifsrepr;
	private String numarticle;
	private Set<EngagementsActifrep> engagementsActifreps = new HashSet<EngagementsActifrep>(
			0);

	public ActifsRepresentatifs() {
	}

	public ActifsRepresentatifs(String codeactifrep) {
		this.codeactifrep = codeactifrep;
	}

	public ActifsRepresentatifs(String codeactifrep, String libelleactifsrepr,
			String numarticle, Set<EngagementsActifrep> engagementsActifreps) {
		this.codeactifrep = codeactifrep;
		this.libelleactifsrepr = libelleactifsrepr;
		this.numarticle = numarticle;
		this.engagementsActifreps = engagementsActifreps;
	}

	@Id
	@Column(name = "CODEACTIFREP", unique = true, nullable = false, length = 20)
	public String getCodeactifrep() {
		return this.codeactifrep;
	}

	public void setCodeactifrep(String codeactifrep) {
		this.codeactifrep = codeactifrep;
	}

	@Column(name = "LIBELLEACTIFSREPR", length = 250)
	public String getLibelleactifsrepr() {
		return this.libelleactifsrepr;
	}

	public void setLibelleactifsrepr(String libelleactifsrepr) {
		this.libelleactifsrepr = libelleactifsrepr;
	}

	@Column(name = "NUMARTICLE", length = 50)
	public String getNumarticle() {
		return this.numarticle;
	}

	public void setNumarticle(String numarticle) {
		this.numarticle = numarticle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actifsRepresentatifs")
	public Set<EngagementsActifrep> getEngagementsActifreps() {
		return this.engagementsActifreps;
	}

	public void setEngagementsActifreps(
			Set<EngagementsActifrep> engagementsActifreps) {
		this.engagementsActifreps = engagementsActifreps;
	}

}