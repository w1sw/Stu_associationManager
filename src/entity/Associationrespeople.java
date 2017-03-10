package entity;


/**
 * Associationrespeople entity. @author MyEclipse Persistence Tools
 */


public class Associationrespeople implements java.io.Serializable {

	// Fields

	private Integer assoResId;
	private String assoResCode;
	private String assoResPassword;
	private String assoResName;
	private String assoResSex;
	private Integer assoResAge;
	private String assoResEmail;
	private String assoResPhone;
	private String assoResPosition;
	private String assoResClass;
	private String association;

	// Constructors

	/** default constructor */
	public Associationrespeople() {
	}

	/** minimal constructor */
	public Associationrespeople(String assoResCode, String assoResPassword) {
		this.assoResCode = assoResCode;
		this.assoResPassword = assoResPassword;
	}

	/** full constructor */
	public Associationrespeople(String assoResCode, String assoResPassword,
			String assoResName, String assoResSex, Integer assoResAge,
			String assoResEmail, String assoResPhone, String assoResPosition,
			String assoResClass, String association) {
		this.assoResCode = assoResCode;
		this.assoResPassword = assoResPassword;
		this.assoResName = assoResName;
		this.assoResSex = assoResSex;
		this.assoResAge = assoResAge;
		this.assoResEmail = assoResEmail;
		this.assoResPhone = assoResPhone;
		this.assoResPosition = assoResPosition;
		this.assoResClass = assoResClass;
		this.association = association;
	}

	// Property accessors

	public Integer getAssoResId() {
		return this.assoResId;
	}

	public void setAssoResId(Integer assoResId) {
		this.assoResId = assoResId;
	}

	public String getAssoResCode() {
		return this.assoResCode;
	}

	public void setAssoResCode(String assoResCode) {
		this.assoResCode = assoResCode;
	}

	public String getAssoResPassword() {
		return this.assoResPassword;
	}

	public void setAssoResPassword(String assoResPassword) {
		this.assoResPassword = assoResPassword;
	}

	public String getAssoResName() {
		return this.assoResName;
	}

	public void setAssoResName(String assoResName) {
		this.assoResName = assoResName;
	}

	public String getAssoResSex() {
		return this.assoResSex;
	}

	public void setAssoResSex(String assoResSex) {
		this.assoResSex = assoResSex;
	}

	public Integer getAssoResAge() {
		return this.assoResAge;
	}

	public void setAssoResAge(Integer assoResAge) {
		this.assoResAge = assoResAge;
	}

	public String getAssoResEmail() {
		return this.assoResEmail;
	}

	public void setAssoResEmail(String assoResEmail) {
		this.assoResEmail = assoResEmail;
	}

	public String getAssoResPhone() {
		return this.assoResPhone;
	}

	public void setAssoResPhone(String assoResPhone) {
		this.assoResPhone = assoResPhone;
	}

	public String getAssoResPosition() {
		return this.assoResPosition;
	}

	public void setAssoResPosition(String assoResPosition) {
		this.assoResPosition = assoResPosition;
	}

	public String getAssoResClass() {
		return this.assoResClass;
	}

	public void setAssoResClass(String assoResClass) {
		this.assoResClass = assoResClass;
	}

	public String getAssociation() {
		return this.association;
	}

	public void setAssociation(String association) {
		this.association = association;
	}

}