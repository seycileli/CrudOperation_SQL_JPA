package entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TS")
public class TeachingStaff extends Staff {

	private static final long serialVersionUID = 1L;
	@Basic
	@Column
	private String qualification;
	@Basic
	@Column
	private String subjectExpertise;
	@Basic
	@Column
	private List<Certificates> certificates;

	public TeachingStaff() {
		super();
	}
	
	public TeachingStaff(int sid, String name, List<Integer> phoneNumbers,
			String qualifaction, String subjectExpertise, List<Certificates> certificates) {
		super(sid, name, phoneNumbers); // << needs to be fixed
		this.qualification = qualifaction;
		this.subjectExpertise = subjectExpertise;
		this.certificates = certificates;
	}
	
	public TeachingStaff(String qualification, String subjectExpertise, 
			List<Certificates> certificates) {
		super();
		this.qualification = qualification;
		this.subjectExpertise = subjectExpertise;
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "TeachingStaff [qualification=" + qualification 
				+ ", subjectExpertise=" + subjectExpertise ;
	}
	
	public String getQualification() {
		return qualification;
	}
	
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public String getSubjectExpertise() {
		return subjectExpertise;
	}
	
	public void setSubjectExpertise(String subjectExpertise) {
		this.subjectExpertise = subjectExpertise;
	}
	
}
