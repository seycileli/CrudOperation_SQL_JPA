package entities;

import java.util.ArrayList;
import java.util.List;

public class Certificates extends TeachingStaff {

	private static final long serialVersionUID = 1L;
	private List<String> certification;
	private String name;
	private int year;
	
	public List<String> getCertification() {
		return certification;
	}
	public void setCertification(ArrayList<String> certification) {
		this.certification = certification;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Certificates [certification=" + certification + ", name=" + name + ", year=" + year + "]";
	}
	public Certificates(List<String> certification, String name, int year) {
		super();
		this.certification = certification;
		this.name = name;
		this.year = year;
	}
	public Certificates() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificates(String qualification, String subjectExpertise, List<Certificates> certificates) {
		super(qualification, subjectExpertise, certificates);
		// TODO Auto-generated constructor stub
	}

}
