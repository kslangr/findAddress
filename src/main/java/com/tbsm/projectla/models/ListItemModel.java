package com.tbsm.projectla.models;

/**
 * @author keithlangreck
 * Template
 */
public class ListItemModel {
	private Integer key;
	private String value;	
	
	/**
	 * Default Constructor
	 */
	public ListItemModel() {
		// Default
	}
	
	/**
	 * @param key
	 * @param value
	 */
	public ListItemModel(Integer key, String value) {
		this.key = key;
		this.value = value;
	}



	/**
	 * @return the key
	 */
	public Integer getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(Integer key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}	
}