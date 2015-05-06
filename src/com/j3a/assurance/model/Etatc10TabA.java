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
 * Etatc10TabA generated by hbm2java
 */
@Entity
@Table(name = "etatc10_tab_a", catalog = "zeusbd")
public class Etatc10TabA implements java.io.Serializable {

	private String codeetatc10;
	private CategorieCima categorieCima;
	private String libelleEtat;
	private Set<EtatCima> etatCimas = new HashSet<EtatCima>(0);
	private Set<Etatc10tabaExercice> etatc10tabaExercices = new HashSet<Etatc10tabaExercice>(
			0);

	public Etatc10TabA() {
	}

	public Etatc10TabA(String codeetatc10) {
		this.codeetatc10 = codeetatc10;
	}

	public Etatc10TabA(String codeetatc10, CategorieCima categorieCima,
			String libelleEtat, Set<EtatCima> etatCimas,
			Set<Etatc10tabaExercice> etatc10tabaExercices) {
		this.codeetatc10 = codeetatc10;
		this.categorieCima = categorieCima;
		this.libelleEtat = libelleEtat;
		this.etatCimas = etatCimas;
		this.etatc10tabaExercices = etatc10tabaExercices;
	}

	@Id
	@Column(name = "CODEETATC10", unique = true, nullable = false, length = 20)
	public String getCodeetatc10() {
		return this.codeetatc10;
	}

	public void setCodeetatc10(String codeetatc10) {
		this.codeetatc10 = codeetatc10;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODECATEGORIECIMA")
	public CategorieCima getCategorieCima() {
		return this.categorieCima;
	}

	public void setCategorieCima(CategorieCima categorieCima) {
		this.categorieCima = categorieCima;
	}

	@Column(name = "LIBELLE_ETAT", length = 40)
	public String getLibelleEtat() {
		return this.libelleEtat;
	}

	public void setLibelleEtat(String libelleEtat) {
		this.libelleEtat = libelleEtat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "etatc10TabA")
	public Set<EtatCima> getEtatCimas() {
		return this.etatCimas;
	}

	public void setEtatCimas(Set<EtatCima> etatCimas) {
		this.etatCimas = etatCimas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "etatc10TabA")
	public Set<Etatc10tabaExercice> getEtatc10tabaExercices() {
		return this.etatc10tabaExercices;
	}

	public void setEtatc10tabaExercices(
			Set<Etatc10tabaExercice> etatc10tabaExercices) {
		this.etatc10tabaExercices = etatc10tabaExercices;
	}

}
