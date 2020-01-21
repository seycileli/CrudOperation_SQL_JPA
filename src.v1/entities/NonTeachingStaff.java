package entities;

import java.util.ArrayList;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NS")
public class NonTeachingStaff extends Staff {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic
	@Column
	private String areaExperience;
	
	public NonTeachingStaff() {
		super();
	}

	public NonTeachingStaff(String areaExperience) {
		super();
		this.areaExperience = areaExperience;
	}
	
	public NonTeachingStaff(int sid, String name, ArrayList<Integer> phoneNumbers,
			String areaExperience) {
		super(sid, name, phoneNumbers);
		this.areaExperience = areaExperience;
	}

	@Override
	public String toString() {
		return "NonTeachingStaff [areaExperience=" + areaExperience + "]";
	}
	
	public String getAreaExperience() {
		return areaExperience;
	}

	public void setAreaExperience(String areaExperience) {
		this.areaExperience = areaExperience;
	}

}
