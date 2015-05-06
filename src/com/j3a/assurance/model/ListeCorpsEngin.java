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
 * ListeCorpsEngin generated by hbm2java
 */
@Entity
@Table(name = "liste_corps_engin", catalog = "zeusbd")
public class ListeCorpsEngin implements java.io.Serializable {

	private String codeListeCorpsEngin;
	private String libelleListeCorpsEngin;
	private Set<CorpsEngin> corpsEngins = new HashSet<CorpsEngin>(0);
	private Set<AvListeCorpsEngin> avListeCorpsEngins = new HashSet<AvListeCorpsEngin>(
			0);

	public ListeCorpsEngin() {
	}

	public ListeCorpsEngin(String codeListeCorpsEngin) {
		this.codeListeCorpsEngin = codeListeCorpsEngin;
	}

	public ListeCorpsEngin(String codeListeCorpsEngin,
			String libelleListeCorpsEngin, Set<CorpsEngin> corpsEngins,
			Set<AvListeCorpsEngin> avListeCorpsEngins) {
		this.codeListeCorpsEngin = codeListeCorpsEngin;
		this.libelleListeCorpsEngin = libelleListeCorpsEngin;
		this.corpsEngins = corpsEngins;
		this.avListeCorpsEngins = avListeCorpsEngins;
	}

	@Id
	@Column(name = "CODE_LISTE_CORPS_ENGIN", unique = true, nullable = false, length = 27)
	public String getCodeListeCorpsEngin() {
		return this.codeListeCorpsEngin;
	}

	public void setCodeListeCorpsEngin(String codeListeCorpsEngin) {
		this.codeListeCorpsEngin = codeListeCorpsEngin;
	}

	@Column(name = "LIBELLE_LISTE_CORPS_ENGIN", length = 50)
	public String getLibelleListeCorpsEngin() {
		return this.libelleListeCorpsEngin;
	}

	public void setLibelleListeCorpsEngin(String libelleListeCorpsEngin) {
		this.libelleListeCorpsEngin = libelleListeCorpsEngin;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeCorpsEngin")
	public Set<CorpsEngin> getCorpsEngins() {
		return this.corpsEngins;
	}

	public void setCorpsEngins(Set<CorpsEngin> corpsEngins) {
		this.corpsEngins = corpsEngins;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "listeCorpsEngin")
	public Set<AvListeCorpsEngin> getAvListeCorpsEngins() {
		return this.avListeCorpsEngins;
	}

	public void setAvListeCorpsEngins(Set<AvListeCorpsEngin> avListeCorpsEngins) {
		this.avListeCorpsEngins = avListeCorpsEngins;
	}

}
