package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Etatc10TabB generated by hbm2java
 */
@Entity
@Table(name = "etatc10_tab_b", catalog = "zeusbd")
public class Etatc10TabB implements java.io.Serializable {

	private String codeetatc10b;
	private CategorieCima categorieCima;
	private EtatCima etatCima;
	private String libelleEtat;
	private Set<Etatc10tabbExercice> etatc10tabbExercices = new HashSet<Etatc10tabbExercice>(
			0);

	public Etatc10TabB() {
	}

	public Etatc10TabB(String codeetatc10b) {
		this.codeetatc10b = codeetatc10b;
	}

	public Etatc10TabB(String codeetatc10b, CategorieCima categorieCima,
			EtatCima etatCima, String libelleEtat,
			Set<Etatc10tabbExercice> etatc10tabbExercices) {
		this.codeetatc10b = codeetatc10b;
		this.categorieCima = categorieCima;
		this.etatCima = etatCima;
		this.libelleEtat = libelleEtat;
		this.etatc10tabbExercices = etatc10tabbExercices;
	}

	@Id
	@Column(name = "CODEETATC10B", unique = true, nullable = false)
	public String getCodeetatc10b() {
		return this.codeetatc10b;
	}

	public void setCodeetatc10b(String codeetatc10b) {
		this.codeetatc10b = codeetatc10b;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODECATEGORIECIMA")
	public CategorieCima getCategorieCima() {
		return this.categorieCima;
	}

	public void setCategorieCima(CategorieCima categorieCima) {
		this.categorieCima = categorieCima;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_ETAT_CIMA")
	public EtatCima getEtatCima() {
		return this.etatCima;
	}

	public void setEtatCima(EtatCima etatCima) {
		this.etatCima = etatCima;
	}

	@Column(name = "LIBELLE_ETAT", length = 40)
	public String getLibelleEtat() {
		return this.libelleEtat;
	}

	public void setLibelleEtat(String libelleEtat) {
		this.libelleEtat = libelleEtat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "etatc10TabB")
	public Set<Etatc10tabbExercice> getEtatc10tabbExercices() {
		return this.etatc10tabbExercices;
	}

	public void setEtatc10tabbExercices(
			Set<Etatc10tabbExercice> etatc10tabbExercices) {
		this.etatc10tabbExercices = etatc10tabbExercices;
	}

}
