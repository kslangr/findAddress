package com.tbsm.projectla.models;

/**
 * @author keithlangreck
 * Template
 */
public class ContactModel {
	private Integer contactId;
	private String name;
	private String vendorNumber;
	private String phone;
	private String email;
	private String fax;
	
	
	
	public ContactModel() {
		// Default
	}

	public ContactModel(Integer contactId, String name, String vendorNumber, String phone, String email, String fax) {
		this.contactId = contactId;
		this.name = name;
		this.vendorNumber = vendorNumber;
		this.phone = phone;
		this.email = email;
		this.fax = fax;
	}

	/**
	 * @return the contactId
	 */
	public Integer getContactId() {
		return contactId;
	}
	
	/**
	 * @param contactId the contactId to set
	 */
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the vendorNumber
	 */
	public String getVendorNumber() {
		return vendorNumber;
	}
	
	/**
	 * @param vendorNumber the vendorNumber to set
	 */
	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}
	
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}
	
	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
}