package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Accords generated by hbm2java
 */
@Entity
@Table(name = "accords", catalog = "zeusbd")
public class Accords implements java.io.Serializable {

	private String codeAccord;
	private String clausesAccord;
	private String refTextAccord;
	private String natureAccord;
	private Set<EtatCima> etatCimas = new HashSet<EtatCima>(0);

	public Accords() {
	}

	public Accords(String codeAccord) {
		this.codeAccord = codeAccord;
	}

	public Accords(String codeAccord, String clausesAccord,
			String refTextAccord, String natureAccord, Set<EtatCima> etatCimas) {
		this.codeAccord = codeAccord;
		this.clausesAccord = clausesAccord;
		this.refTextAccord = refTextAccord;
		this.natureAccord = natureAccord;
		this.etatCimas = etatCimas;
	}

	@Id
	@Column(name = "CODE_ACCORD", unique = true, nullable = false)
	public String getCodeAccord() {
		return this.codeAccord;
	}

	public void setCodeAccord(String codeAccord) {
		this.codeAccord = codeAccord;
	}

	@Column(name = "CLAUSES_ACCORD")
	public String getClausesAccord() {
		return this.clausesAccord;
	}

	public void setClausesAccord(String clausesAccord) {
		this.clausesAccord = clausesAccord;
	}

	@Column(name = "REF_TEXT_ACCORD")
	public String getRefTextAccord() {
		return this.refTextAccord;
	}

	public void setRefTextAccord(String refTextAccord) {
		this.refTextAccord = refTextAccord;
	}

	@Column(name = "NATURE_ACCORD", length = 100)
	public String getNatureAccord() {
		return this.natureAccord;
	}

	public void setNatureAccord(String natureAccord) {
		this.natureAccord = natureAccord;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "accordses")
	public Set<EtatCima> getEtatCimas() {
		return this.etatCimas;
	}

	public void setEtatCimas(Set<EtatCima> etatCimas) {
		this.etatCimas = etatCimas;
	}

}
