/**
 * 
 */
package jha.omnitya;

import javax.persistence.Embeddable;
import javax.persistence.Table;

/**
 * @author omnityajha
 *
 */
@Embeddable
@Table (name="SKILL_LIST")
public class Skills {
	
	private String experience;
	private String language;
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
