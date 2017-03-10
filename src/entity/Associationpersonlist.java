package entity;

/**
 * Associationpersonlist entity. @author MyEclipse Persistence Tools
 */


public class Associationpersonlist implements java.io.Serializable {

	// Fields

	private Integer assoPersonId;
	private String assoPersonCode;
	private String assoPersonPassword;
	private String assoPersonName;
	private String assoPersonSex;
	private Integer assoPersonAge;
	private String assoPersonEmail;
	private String assoPersonPhone;
	private String assoPersonPosition;
	private String assoPersonCollege;
	private String association;

	// Constructors

	/** default constructor */
	public Associationpersonlist() {
	}

	/** minimal constructor */
	public Associationpersonlist(String assoPersonCode,
			String assoPersonPassword) {
		this.assoPersonCode = assoPersonCode;
		this.assoPersonPassword = assoPersonPassword;
	}

	/** full constructor */
	public Associationpersonlist(String assoPersonCode,
			String assoPersonPassword, String assoPersonName,
			String assoPersonSex, Integer assoPersonAge,
			String assoPersonEmail, String assoPersonPhone,
			String assoPersonPosition, String assoPersonCollege,
			String association) {
		this.assoPersonCode = assoPersonCode;
		this.assoPersonPassword = assoPersonPassword;
		this.assoPersonName = assoPersonName;
		this.assoPersonSex = assoPersonSex;
		this.assoPersonAge = assoPersonAge;
		this.assoPersonEmail = assoPersonEmail;
		this.assoPersonPhone = assoPersonPhone;
		this.assoPersonPosition = assoPersonPosition;
		this.assoPersonCollege = assoPersonCollege;
		this.association = association;
	}

	// Property accessors

	public Integer getAssoPersonId() {
		return this.assoPersonId;
	}

	public void setAssoPersonId(Integer assoPersonId) {
		this.assoPersonId = assoPersonId;
	}

	public String getAssoPersonCode() {
		return this.assoPersonCode;
	}

	public void setAssoPersonCode(String assoPersonCode) {
		this.assoPersonCode = assoPersonCode;
	}

	public String getAssoPersonPassword() {
		return this.assoPersonPassword;
	}

	public void setAssoPersonPassword(String assoPersonPassword) {
		this.assoPersonPassword = assoPersonPassword;
	}

	public String getAssoPersonName() {
		return this.assoPersonName;
	}

	public void setAssoPersonName(String assoPersonName) {
		this.assoPersonName = assoPersonName;
	}

	public String getAssoPersonSex() {
		return this.assoPersonSex;
	}

	public void setAssoPersonSex(String assoPersonSex) {
		this.assoPersonSex = assoPersonSex;
	}

	public Integer getAssoPersonAge() {
		return this.assoPersonAge;
	}

	public void setAssoPersonAge(Integer assoPersonAge) {
		this.assoPersonAge = assoPersonAge;
	}

	public String getAssoPersonEmail() {
		return this.assoPersonEmail;
	}

	public void setAssoPersonEmail(String assoPersonEmail) {
		this.assoPersonEmail = assoPersonEmail;
	}

	public String getAssoPersonPhone() {
		return this.assoPersonPhone;
	}

	public void setAssoPersonPhone(String assoPersonPhone) {
		this.assoPersonPhone = assoPersonPhone;
	}

	public String getAssoPersonPosition() {
		return this.assoPersonPosition;
	}

	public void setAssoPersonPosition(String assoPersonPosition) {
		this.assoPersonPosition = assoPersonPosition;
	}

	public String getAssoPersonCollege() {
		return this.assoPersonCollege;
	}

	public void setAssoPersonCollege(String assoPersonCollege) {
		this.assoPersonCollege = assoPersonCollege;
	}

	public String getAssociation() {
		return this.association;
	}

	public void setAssociation(String association) {
		this.association = association;
	}

}