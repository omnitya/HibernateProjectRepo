package jha.omnitya;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author omnityajha
 *
 */
@Embeddable
public class Address {
	
	@Column (name="STREET_NAME")
	private String streetName;
	@Column (name="CITY_NAME")
	private String cityName;
	@Column (name="STATE_NAME")
	private String stateName;
	@Column (name="PIN_CODE")
	private String pinCode;
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}
