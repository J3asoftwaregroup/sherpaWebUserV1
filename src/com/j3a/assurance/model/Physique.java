package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Physique generated by hbm2java
 */
@Entity
@Table(name = "physique", catalog = "zeusbd")
public class Physique implements java.io.Serializable {

	private String numSouscripteur;
	private Personne personne;
	private Sexe sexe;
	private Date datePers;
	private String nomRaisonSociale;
	private String prenomPers;
	private Date dateNaissPers;
	private String lieuNaissPers;
	private String situationMatPers;
	private String numPiecePers;
	private String titre;
	private String profession;
	private String categorieProfessionnelle;
	private String typePiece;
	private String adresseGeo;
	private String adresse;
	private String telephone;
	private String fax;
	private String email;
	private Set<Permis> permises = new HashSet<Permis>(0);

	public Physique() {
	}

	public Physique(Personne personne, Sexe sexe) {
		this.personne = personne;
		this.sexe = sexe;
	}

	public Physique(Personne personne, Sexe sexe, Date datePers,
			String nomRaisonSociale, String prenomPers, Date dateNaissPers,
			String lieuNaissPers, String situationMatPers, String numPiecePers,
			String titre, String profession, String categorieProfessionnelle,
			String typePiece, String adresseGeo, String adresse,
			String telephone, String fax, String email, Set<Permis> permises) {
		this.personne = personne;
		this.sexe = sexe;
		this.datePers = datePers;
		this.nomRaisonSociale = nomRaisonSociale;
		this.prenomPers = prenomPers;
		this.dateNaissPers = dateNaissPers;
		this.lieuNaissPers = lieuNaissPers;
		this.situationMatPers = situationMatPers;
		this.numPiecePers = numPiecePers;
		this.titre = titre;
		this.profession = profession;
		this.categorieProfessionnelle = categorieProfessionnelle;
		this.typePiece = typePiece;
		this.adresseGeo = adresseGeo;
		this.adresse = adresse;
		this.telephone = telephone;
		this.fax = fax;
		this.email = email;
		this.permises = permises;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "personne"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "NUM_SOUSCRIPTEUR", unique = true, nullable = false, length = 15)
	public String getNumSouscripteur() {
		return this.numSouscripteur;
	}

	public void setNumSouscripteur(String numSouscripteur) {
		this.numSouscripteur = numSouscripteur;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_SEXE", nullable = false)
	public Sexe getSexe() {
		return this.sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_PERS", length = 10)
	public Date getDatePers() {
		return this.datePers;
	}

	public void setDatePers(Date datePers) {
		this.datePers = datePers;
	}

	@Column(name = "NOM_RAISON_SOCIALE", length = 50)
	public String getNomRaisonSociale() {
		return this.nomRaisonSociale;
	}

	public void setNomRaisonSociale(String nomRaisonSociale) {
		this.nomRaisonSociale = nomRaisonSociale;
	}

	@Column(name = "PRENOM_PERS", length = 70)
	public String getPrenomPers() {
		return this.prenomPers;
	}

	public void setPrenomPers(String prenomPers) {
		this.prenomPers = prenomPers;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_NAISS_PERS", length = 10)
	public Date getDateNaissPers() {
		return this.dateNaissPers;
	}

	public void setDateNaissPers(Date dateNaissPers) {
		this.dateNaissPers = dateNaissPers;
	}

	@Column(name = "LIEU_NAISS_PERS", length = 30)
	public String getLieuNaissPers() {
		return this.lieuNaissPers;
	}

	public void setLieuNaissPers(String lieuNaissPers) {
		this.lieuNaissPers = lieuNaissPers;
	}

	@Column(name = "SITUATION_MAT_PERS", length = 12)
	public String getSituationMatPers() {
		return this.situationMatPers;
	}

	public void setSituationMatPers(String situationMatPers) {
		this.situationMatPers = situationMatPers;
	}

	@Column(name = "NUM_PIECE_PERS", length = 15)
	public String getNumPiecePers() {
		return this.numPiecePers;
	}

	public void setNumPiecePers(String numPiecePers) {
		this.numPiecePers = numPiecePers;
	}

	@Column(name = "TITRE", length = 50)
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Column(name = "PROFESSION", length = 50)
	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Column(name = "CATEGORIE_PROFESSIONNELLE", length = 50)
	public String getCategorieProfessionnelle() {
		return this.categorieProfessionnelle;
	}

	public void setCategorieProfessionnelle(String categorieProfessionnelle) {
		this.categorieProfessionnelle = categorieProfessionnelle;
	}

	@Column(name = "TYPE_PIECE", length = 15)
	public String getTypePiece() {
		return this.typePiece;
	}

	public void setTypePiece(String typePiece) {
		this.typePiece = typePiece;
	}

	@Column(name = "ADRESSE_GEO", length = 75)
	public String getAdresseGeo() {
		return this.adresseGeo;
	}

	public void setAdresseGeo(String adresseGeo) {
		this.adresseGeo = adresseGeo;
	}

	@Column(name = "ADRESSE", length = 60)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column(name = "TELEPHONE", length = 16)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "FAX", length = 16)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "EMAIL", length = 60)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "physique")
	public Set<Permis> getPermises() {
		return this.permises;
	}

	public void setPermises(Set<Permis> permises) {
		this.permises = permises;
	}

}
