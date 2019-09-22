package com.tbsm.projectla.models;

/**
 * @author keithlangreck
 * Template
 */
public class OrganizationModel {
	private Integer orgId;
	private String organization;
	private String legalName;	
	private ListItemModel legalClassification;
	private String federalId;
	private String placeOfRegistration;
	private ListItemModel incorporationLocation;
	
	
	
	public OrganizationModel() {
		super();
	}

	public OrganizationModel(Integer orgId, String organization, String legalName, ListItemModel legalClassification,
			String federalId, String placeOfRegistration, ListItemModel incorporationLocation) {
		super();
		this.orgId = orgId;
		this.organization = organization;
		this.legalName = legalName;
		this.legalClassification = legalClassification;
		this.federalId = federalId;
		this.placeOfRegistration = placeOfRegistration;
		this.incorporationLocation = incorporationLocation;
	}

	/**
	 * @return the orgId
	 */
	public Integer getOrgId() {
		return orgId;
	}
	
	/**
	 * @param orgId the orgId to set
	 */
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	
	/**
	 * @return the organization
	 */
	public String getOrganization() {
		return organization;
	}
	
	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	/**
	 * @return the legalName
	 */
	public String getLegalName() {
		return legalName;
	}
	
	/**
	 * @param legalName the legalName to set
	 */
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	
	/**
	 * @return the legalClassification
	 */
	public ListItemModel getLegalClassification() {
		return legalClassification;
	}
	
	/**
	 * @param legalClassification the legalClassification to set
	 */
	public void setLegalClassification(ListItemModel legalClassification) {
		this.legalClassification = legalClassification;
	}
	
	/**
	 * @return the federalId
	 */
	public String getFederalId() {
		return federalId;
	}
	
	/**
	 * @param federalId the federalId to set
	 */
	public void setFederalId(String federalId) {
		this.federalId = federalId;
	}
	
	/**
	 * @return the placeOfRegistration
	 */
	public String getPlaceOfRegistration() {
		return placeOfRegistration;
	}
	
	/**
	 * @param placeOfRegistration the placeOfRegistration to set
	 */
	public void setPlaceOfRegistration(String placeOfRegistration) {
		this.placeOfRegistration = placeOfRegistration;
	}
	
	/**
	 * @return the incorporationLocation
	 */
	public ListItemModel getIncorporationLocation() {
		return incorporationLocation;
	}
	
	/**
	 * @param incorporationLocation the incorporationLocation to set
	 */
	public void setIncorporationLocation(ListItemModel incorporationLocation) {
		this.incorporationLocation = incorporationLocation;
	}	
}