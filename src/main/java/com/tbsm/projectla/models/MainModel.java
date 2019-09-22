package com.tbsm.projectla.models;

public class MainModel {
	private ContactModel contactModel = new ContactModel();
	private LocationModel locationModel = new LocationModel();
	private OrganizationModel organizationModel = new OrganizationModel();
		
	
	public MainModel() {
		// Default
	}

	/**
	 * @return the contactModel
	 */
	public ContactModel getContactModel() {
		return contactModel;
	}
	
	/**
	 * @param contactModel the contactModel to set
	 */
	public void setContactModel(ContactModel contactModel) {
		this.contactModel = contactModel;
	}
	
	/**
	 * @return the locationModel
	 */
	public LocationModel getLocationModel() {
		return locationModel;
	}
	
	/**
	 * @param locationModel the locationModel to set
	 */
	public void setLocationModel(LocationModel locationModel) {
		this.locationModel = locationModel;
	}
	
	/**
	 * @return the organizationModel
	 */
	public OrganizationModel getOrganizationModel() {
		return organizationModel;
	}
	
	/**
	 * @param organizationModel the organizationModel to set
	 */
	public void setOrganizationModel(OrganizationModel organizationModel) {
		this.organizationModel = organizationModel;
	}	
}
