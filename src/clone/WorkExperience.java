package clone;

import java.util.Date;

public class WorkExperience {

	private String company;
	private String time;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "WorkExperience [company=" + company + ", time=" + time + "]";
	}

	
	
}
