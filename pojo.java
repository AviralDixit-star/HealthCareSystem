import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;

public class pojo {
private String test;
private String centre;
	private String  userId;
	private BigInteger appointmentId;
	//private String test;
	private LocalDate date;
	private LocalTime time;
	
	private boolean approved;
	
	public BigInteger getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(BigInteger appointmentid2) {
		this.appointmentId = appointmentid2;
	}
	public String getTest() {
		
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date2) {
		this.date = date2;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime lt) {
		this.time = lt;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public String getCentre() {
		return centre;
	}
	public void setCentre(String center) {
		this.centre = center;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	//private String center;
	
	}


