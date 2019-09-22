package com.tbsm.projectla.models;

/**
 * @author keithlangreck
 * This is the Location Model, which will hold all location data
 */
public class LocationModel {
	private Integer locationId;
	private ListItemModel addressType;
	private String locationName;
	private String room;
	private String post_box;
	private String department;
	private String buildingName;	
	private String complexName;	
	private String address;	
	private String subDivision;	
	private String city;	
	private String county;	
	private String state;	
	private String zip;	
	private String country;	
	private String path;
	
	
	/**
	 * Default Constructor
	 */
	public LocationModel() {
		// Default
	}

	public LocationModel(Integer locationId, ListItemModel addressType, String locationName, String room,
			String post_box, String department, String buildingName, String complexName, String address,
			String subDivision, String city, String county, String state, String zip, String country, String path) {
		super();
		this.locationId = locationId;
		this.addressType = addressType;
		this.locationName = locationName;
		this.room = room;
		this.post_box = post_box;
		this.department = department;
		this.buildingName = buildingName;
		this.complexName = complexName;
		this.address = address;
		this.subDivision = subDivision;
		this.city = city;
		this.county = county;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.path = path;
	}



	/**
	 * @return the addressType
	 */
	public ListItemModel getAddressType() {
		return addressType;
	}


	/**
	 * @param addressType the addressType to set
	 */
	public void setAddressType(ListItemModel addressType) {
		this.addressType = addressType;
	}


	/**
	 * @return the locationId
	 */
	public Integer getLocationId() {
		return locationId;
	}


	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}


	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}


	/**
	 * @param locationName the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}


	/**
	 * @return the room
	 */
	public String getRoom() {
		return room;
	}


	/**
	 * @param room the room to set
	 */
	public void setRoom(String room) {
		this.room = room;
	}


	/**
	 * @return the post_box
	 */
	public String getPost_box() {
		return post_box;
	}


	/**
	 * @param post_box the post_box to set
	 */
	public void setPost_box(String post_box) {
		this.post_box = post_box;
	}


	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}


	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}


	/**
	 * @return the buildingName
	 */
	public String getBuildingName() {
		return buildingName;
	}


	/**
	 * @param buildingName the buildingName to set
	 */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}


	/**
	 * @return the complexName
	 */
	public String getComplexName() {
		return complexName;
	}


	/**
	 * @param complexName the complexName to set
	 */
	public void setComplexName(String complexName) {
		this.complexName = complexName;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the subDivision
	 */
	public String getSubDivision() {
		return subDivision;
	}


	/**
	 * @param subDivision the subDivision to set
	 */
	public void setSubDivision(String subDivision) {
		this.subDivision = subDivision;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}


	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}


	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}


	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}


	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}


	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}


	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	
}
