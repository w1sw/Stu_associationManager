package entity;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */


public class Teacher implements java.io.Serializable {

	// Fields

	private Integer teacherId;
	private String teacherName;
	private String teacherCode;
	private String teacherPassword;
	private String teacherSex;
	private Integer teacherAge;
	private String teacherEmail;
	private String teacherPhone;
	private String teacherPosition;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(String teacherName, String teacherCode,
			String teacherPassword) {
		this.teacherName = teacherName;
		this.teacherCode = teacherCode;
		this.teacherPassword = teacherPassword;
	}

	/** full constructor */
	public Teacher(String teacherName, String teacherCode,
			String teacherPassword, String teacherSex, Integer teacherAge,
			String teacherEmail, String teacherPhone, String teacherPosition) {
		this.teacherName = teacherName;
		this.teacherCode = teacherCode;
		this.teacherPassword = teacherPassword;
		this.teacherSex = teacherSex;
		this.teacherAge = teacherAge;
		this.teacherEmail = teacherEmail;
		this.teacherPhone = teacherPhone;
		this.teacherPosition = teacherPosition;
	}

	// Property accessors

	public Integer getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherCode() {
		return this.teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}

	public String getTeacherPassword() {
		return this.teacherPassword;
	}

	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}

	public String getTeacherSex() {
		return this.teacherSex;
	}

	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}

	public Integer getTeacherAge() {
		return this.teacherAge;
	}

	public void setTeacherAge(Integer teacherAge) {
		this.teacherAge = teacherAge;
	}

	public String getTeacherEmail() {
		return this.teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	public String getTeacherPhone() {
		return this.teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}

	public String getTeacherPosition() {
		return this.teacherPosition;
	}

	public void setTeacherPosition(String teacherPosition) {
		this.teacherPosition = teacherPosition;
	}

}