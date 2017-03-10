package entity;

/**
 * Newusers entity. @author MyEclipse Persistence Tools
 */


public class Newusers implements java.io.Serializable {

	// Fields


	private int usersId;
	private String usersCode;
	private String usersPassword;
	private String usersName;
	private String usersSex;
	private int usersAge;
	private String usersEmail;
	private String usersPhone;
	private String usersClass;

	// Constructors

	/** default constructor */
	public Newusers() {
	}

	/** minimal constructor */
	public Newusers(String usersCode, String usersPassword) {
		this.usersCode = usersCode;
		this.usersPassword = usersPassword;
	}

	/** full constructor */
	public Newusers(String usersCode, String usersPassword, String usersName,
			String usersSex, Integer usersAge, String usersEmail,
			String usersPhone, String usersClass) {
		this.usersCode = usersCode;
		this.usersPassword = usersPassword;
		this.usersName = usersName;
		this.usersSex = usersSex;
		this.usersAge = usersAge;
		this.usersEmail = usersEmail;
		this.usersPhone = usersPhone;
		this.usersClass = usersClass;
	}

	// Property accessors

	public int getUsersId() {
		return this.usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}

	public String getUsersCode() {
		return this.usersCode;
	}

	public void setUsersCode(String usersCode) {
		this.usersCode = usersCode;
	}

	public String getUsersPassword() {
		return this.usersPassword;
	}

	public void setUsersPassword(String usersPassword) {
		this.usersPassword = usersPassword;
	}

	public String getUsersName() {
		return this.usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public String getUsersSex() {
		return this.usersSex;
	}

	public void setUsersSex(String usersSex) {
		this.usersSex = usersSex;
	}

	public int getUsersAge() {
		return this.usersAge;
	}

	public void setUsersAge(int usersAge) {
		this.usersAge = usersAge;
	}

	public String getUsersEmail() {
		return this.usersEmail;
	}

	public void setUsersEmail(String usersEmail) {
		this.usersEmail = usersEmail;
	}

	public String getUsersPhone() {
		return this.usersPhone;
	}

	public void setUsersPhone(String usersPhone) {
		this.usersPhone = usersPhone;
	}

	public String getUsersClass() {
		return this.usersClass;
	}

	public void setUsersClass(String usersClass) {
		this.usersClass = usersClass;
	}

}