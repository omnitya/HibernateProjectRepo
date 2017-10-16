package jha.omnitya;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author omnityajha
 *
 */

@Entity (name="USER_DETAILS")
public class UserDetails {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="USER_ID")
	private int userId;
	@Column (name="USER_NAME")
	private String userName;
	@Column (name="JOINING_DATE")
	@Basic (fetch = FetchType.LAZY)
	@Temporal(TemporalType.DATE)
	private Date joiningDate;
	@Embedded
	@ElementCollection
	private List<Skills> skillList = new ArrayList();
	public List<Skills> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<Skills> skillList) {
		this.skillList = skillList;
	}
	@Embedded
	private Address homeAddress;
	@Embedded
	@AttributeOverrides ({
	@AttributeOverride (name="streetName",
						column=@Column (name="OFFICE_STREET_NAME")
			),
	@AttributeOverride (name="cityName",
						column=@Column (name="OFFICE_CITY_NAME")
			),
	@AttributeOverride (name="stateName",
						column=@Column (name="OFFICE_STATE_NAME")
			),
	@AttributeOverride (name="pinCode",
						column=@Column (name="OFFICE_PIN_CODE")
			)
	})
	private Address officeAddress;
	
	public Date getJoiningDate() {
		return joiningDate;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
