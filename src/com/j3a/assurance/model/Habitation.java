package com.j3a.assurance.model;

// Generated 5 mai 2015 11:21:10 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
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
 * Habitation generated by hbm2java
 */
@Entity
@Table(name = "habitation", catalog = "zeusbd")
public class Habitation implements java.io.Serializable {

	private String codeHabitation;
	private Categorie categorie;
	private ClasseMrh classeMrh;
	private ListeHabitation listeHabitation;
	private String localisation;
	private String construction;
	private String couverture;
	private Integer serrure;
	private Integer verrou;
	private Integer nombrePieces;
	private Integer nombrePorte;
	private Integer nombreEtage;
	private Integer superficie;
	private BigDecimal montantLoyer;
	private String typeHabitation;
	private String naturePorte;
	private String natureFenetre;
	private String habitationUsage;
	private String beneficiaire;
	private String gardiennage;
	private String nomenclature;
	private String zone;
	private BigDecimal valeurBatiment;
	private BigDecimal valeurContenu;
	private BigDecimal objetPrecieux;
	private BigDecimal risqueLocatif;
	private String statutHabitation;
	private Set<ApporteurHabitation> apporteurHabitations = new HashSet<ApporteurHabitation>(
			0);
	private Set<HabitationSinistre> habitationSinistres = new HashSet<HabitationSinistre>(
			0);
	private Set<GarantieChoisieMrh> garantieChoisieMrhs = new HashSet<GarantieChoisieMrh>(
			0);

	public Habitation() {
	}

	public Habitation(String codeHabitation) {
		this.codeHabitation = codeHabitation;
	}

	public Habitation(String codeHabitation, Categorie categorie,
			ClasseMrh classeMrh, ListeHabitation listeHabitation,
			String localisation, String construction, String couverture,
			Integer serrure, Integer verrou, Integer nombrePieces,
			Integer nombrePorte, Integer nombreEtage, Integer superficie,
			BigDecimal montantLoyer, String typeHabitation, String naturePorte,
			String natureFenetre, String habitationUsage, String beneficiaire,
			String gardiennage, String nomenclature, String zone,
			BigDecimal valeurBatiment, BigDecimal valeurContenu,
			BigDecimal objetPrecieux, BigDecimal risqueLocatif,
			String statutHabitation,
			Set<ApporteurHabitation> apporteurHabitations,
			Set<HabitationSinistre> habitationSinistres,
			Set<GarantieChoisieMrh> garantieChoisieMrhs) {
		this.codeHabitation = codeHabitation;
		this.categorie = categorie;
		this.classeMrh = classeMrh;
		this.listeHabitation = listeHabitation;
		this.localisation = localisation;
		this.construction = construction;
		this.couverture = couverture;
		this.serrure = serrure;
		this.verrou = verrou;
		this.nombrePieces = nombrePieces;
		this.nombrePorte = nombrePorte;
		this.nombreEtage = nombreEtage;
		this.superficie = superficie;
		this.montantLoyer = montantLoyer;
		this.typeHabitation = typeHabitation;
		this.naturePorte = naturePorte;
		this.natureFenetre = natureFenetre;
		this.habitationUsage = habitationUsage;
		this.beneficiaire = beneficiaire;
		this.gardiennage = gardiennage;
		this.nomenclature = nomenclature;
		this.zone = zone;
		this.valeurBatiment = valeurBatiment;
		this.valeurContenu = valeurContenu;
		this.objetPrecieux = objetPrecieux;
		this.risqueLocatif = risqueLocatif;
		this.statutHabitation = statutHabitation;
		this.apporteurHabitations = apporteurHabitations;
		this.habitationSinistres = habitationSinistres;
		this.garantieChoisieMrhs = garantieChoisieMrhs;
	}

	@Id
	@Column(name = "CODE_HABITATION", unique = true, nullable = false, length = 30)
	public String getCodeHabitation() {
		return this.codeHabitation;
	}

	public void setCodeHabitation(String codeHabitation) {
		this.codeHabitation = codeHabitation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_CATEGORIE")
	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_CLASSE_MRH")
	public ClasseMrh getClasseMrh() {
		return this.classeMrh;
	}

	public void setClasseMrh(ClasseMrh classeMrh) {
		this.classeMrh = classeMrh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CODE_LISTE_HABITATION")
	public ListeHabitation getListeHabitation() {
		return this.listeHabitation;
	}

	public void setListeHabitation(ListeHabitation listeHabitation) {
		this.listeHabitation = listeHabitation;
	}

	@Column(name = "LOCALISATION", length = 70)
	public String getLocalisation() {
		return this.localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	@Column(name = "CONSTRUCTION", length = 50)
	public String getConstruction() {
		return this.construction;
	}

	public void setConstruction(String construction) {
		this.construction = construction;
	}

	@Column(name = "COUVERTURE", length = 50)
	public String getCouverture() {
		return this.couverture;
	}

	public void setCouverture(String couverture) {
		this.couverture = couverture;
	}

	@Column(name = "SERRURE")
	public Integer getSerrure() {
		return this.serrure;
	}

	public void setSerrure(Integer serrure) {
		this.serrure = serrure;
	}

	@Column(name = "VERROU")
	public Integer getVerrou() {
		return this.verrou;
	}

	public void setVerrou(Integer verrou) {
		this.verrou = verrou;
	}

	@Column(name = "NOMBRE_PIECES")
	public Integer getNombrePieces() {
		return this.nombrePieces;
	}

	public void setNombrePieces(Integer nombrePieces) {
		this.nombrePieces = nombrePieces;
	}

	@Column(name = "NOMBRE_PORTE")
	public Integer getNombrePorte() {
		return this.nombrePorte;
	}

	public void setNombrePorte(Integer nombrePorte) {
		this.nombrePorte = nombrePorte;
	}

	@Column(name = "NOMBRE_ETAGE")
	public Integer getNombreEtage() {
		return this.nombreEtage;
	}

	public void setNombreEtage(Integer nombreEtage) {
		this.nombreEtage = nombreEtage;
	}

	@Column(name = "SUPERFICIE")
	public Integer getSuperficie() {
		return this.superficie;
	}

	public void setSuperficie(Integer superficie) {
		this.superficie = superficie;
	}

	@Column(name = "MONTANT_LOYER", precision = 15, scale = 3)
	public BigDecimal getMontantLoyer() {
		return this.montantLoyer;
	}

	public void setMontantLoyer(BigDecimal montantLoyer) {
		this.montantLoyer = montantLoyer;
	}

	@Column(name = "TYPE_HABITATION", length = 50)
	public String getTypeHabitation() {
		return this.typeHabitation;
	}

	public void setTypeHabitation(String typeHabitation) {
		this.typeHabitation = typeHabitation;
	}

	@Column(name = "NATURE_PORTE", length = 50)
	public String getNaturePorte() {
		return this.naturePorte;
	}

	public void setNaturePorte(String naturePorte) {
		this.naturePorte = naturePorte;
	}

	@Column(name = "NATURE_FENETRE", length = 50)
	public String getNatureFenetre() {
		return this.natureFenetre;
	}

	public void setNatureFenetre(String natureFenetre) {
		this.natureFenetre = natureFenetre;
	}

	@Column(name = "HABITATION_USAGE", length = 50)
	public String getHabitationUsage() {
		return this.habitationUsage;
	}

	public void setHabitationUsage(String habitationUsage) {
		this.habitationUsage = habitationUsage;
	}

	@Column(name = "BENEFICIAIRE", length = 50)
	public String getBeneficiaire() {
		return this.beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	@Column(name = "GARDIENNAGE", length = 50)
	public String getGardiennage() {
		return this.gardiennage;
	}

	public void setGardiennage(String gardiennage) {
		this.gardiennage = gardiennage;
	}

	@Column(name = "NOMENCLATURE", length = 50)
	public String getNomenclature() {
		return this.nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		this.nomenclature = nomenclature;
	}

	@Column(name = "ZONE", length = 50)
	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	@Column(name = "VALEUR_BATIMENT", precision = 15, scale = 3)
	public BigDecimal getValeurBatiment() {
		return this.valeurBatiment;
	}

	public void setValeurBatiment(BigDecimal valeurBatiment) {
		this.valeurBatiment = valeurBatiment;
	}

	@Column(name = "VALEUR_CONTENU", precision = 15, scale = 3)
	public BigDecimal getValeurContenu() {
		return this.valeurContenu;
	}

	public void setValeurContenu(BigDecimal valeurContenu) {
		this.valeurContenu = valeurContenu;
	}

	@Column(name = "OBJET_PRECIEUX", precision = 15, scale = 3)
	public BigDecimal getObjetPrecieux() {
		return this.objetPrecieux;
	}

	public void setObjetPrecieux(BigDecimal objetPrecieux) {
		this.objetPrecieux = objetPrecieux;
	}

	@Column(name = "RISQUE_LOCATIF", precision = 15, scale = 3)
	public BigDecimal getRisqueLocatif() {
		return this.risqueLocatif;
	}

	public void setRisqueLocatif(BigDecimal risqueLocatif) {
		this.risqueLocatif = risqueLocatif;
	}

	@Column(name = "STATUT_HABITATION", length = 30)
	public String getStatutHabitation() {
		return this.statutHabitation;
	}

	public void setStatutHabitation(String statutHabitation) {
		this.statutHabitation = statutHabitation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "habitation")
	public Set<ApporteurHabitation> getApporteurHabitations() {
		return this.apporteurHabitations;
	}

	public void setApporteurHabitations(
			Set<ApporteurHabitation> apporteurHabitations) {
		this.apporteurHabitations = apporteurHabitations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "habitation")
	public Set<HabitationSinistre> getHabitationSinistres() {
		return this.habitationSinistres;
	}

	public void setHabitationSinistres(
			Set<HabitationSinistre> habitationSinistres) {
		this.habitationSinistres = habitationSinistres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "habitation")
	public Set<GarantieChoisieMrh> getGarantieChoisieMrhs() {
		return this.garantieChoisieMrhs;
	}

	public void setGarantieChoisieMrhs(
			Set<GarantieChoisieMrh> garantieChoisieMrhs) {
		this.garantieChoisieMrhs = garantieChoisieMrhs;
	}

}