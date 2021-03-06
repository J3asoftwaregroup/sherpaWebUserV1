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
 * ListeAssureIa generated by hbm2java
 */
@Entity
@Table(name = "liste_assure_ia", catalog = "zeusbd")
public class ListeAssureIa implements java.io.Serializable {

	private String codeListeAssureIa;
	private String libelleListeAssureIa;
	private Set<AssureIa> assureIas = new HashSet<AssureIa>(0);
	private Set<AvListeAssureIa> avListeAssureIas = new HashSet<AvListeAssureIa>(
			0);

	public ListeAssureIa() {
	}

	public ListeAssureIa(String codeListeAssureIa) {
		this.codeListeAssureIa = codeListeAssureIa;
	}

	public ListeAssureIa(String codeListeAssureIa, String libelleListeAssureIa,
			Set<AssureIa> assureIas, Set<AvListeAssureIa> avListeAssureIas) {
		this.codeListeAssureIa = codeListeAssureIa;
		this.libelleListeAssureIa = libelleListeAssureIa;
		this.assureIas = assureIas;
		this.avListeAssureIas = avListeAssureIas;
	}

	@Id
	@Column(name = "CODE_LISTE_ASSURE_IA", unique = true, nullable = false, length = 30)
	public String getCodeListeAssureIa() {
		return this.codeListeAssureIa;
	}

	public void setCodeListeAssureIa(String codeListeAssureIa) {
		this.codeListeAssureIa = codeListeAssureIa;
	}

	@Column(name = "LIBELLE_LISTE_ASSURE_IA", length = 50)
	public String getLibelleListeAssureIa() {
		return this.libelleListeAssureIa;
	}

	public void setLibelleListeAssureIa(String libelleListeAssureIa) {
		this.libelleListeAssureIa = libelleListeAssureIa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeAssureIa")
	public Set<AssureIa> getAssureIas() {
		return this.assureIas;
	}

	public void setAssureIas(Set<AssureIa> assureIas) {
		this.assureIas = assureIas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeAssureIa")
	public Set<AvListeAssureIa> getAvListeAssureIas() {
		return this.avListeAssureIas;
	}

	public void setAvListeAssureIas(Set<AvListeAssureIa> avListeAssureIas) {
		this.avListeAssureIas = avListeAssureIas;
	}

}
