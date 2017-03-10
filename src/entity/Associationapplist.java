package entity;

/**
 * Associationapplist entity. @author MyEclipse Persistence Tools
 */


public class Associationapplist implements java.io.Serializable {

	// Fields


	private Integer assoId;
	private String assoName;
	private String assoPosition;
	private Integer assoPersonNum;
	private String assoResClass;
	private String assoResPhone;
	private String assoResName;
	private String assoIntroduce;

	// Constructors

	/** default constructor */
	public Associationapplist() {
	}

	/** minimal constructor */
	public Associationapplist(String assoName, String assoPosition,
			String assoResClass, String assoResPhone, String assoResName) {
		this.assoName = assoName;
		this.assoPosition = assoPosition;
		this.assoResClass = assoResClass;
		this.assoResPhone = assoResPhone;
		this.assoResName = assoResName;
	}

	/** full constructor */
	public Associationapplist(String assoName, String assoPosition,
			Integer assoPersonNum, String assoResClass, String assoResPhone,
			String assoResName, String assoIntroduce) {
		this.assoName = assoName;
		this.assoPosition = assoPosition;
		this.assoPersonNum = assoPersonNum;
		this.assoResClass = assoResClass;
		this.assoResPhone = assoResPhone;
		this.assoResName = assoResName;
		this.assoIntroduce = assoIntroduce;
	}

	// Property accessors

	public Integer getAssoId() {
		return this.assoId;
	}

	public void setAssoId(Integer assoId) {
		this.assoId = assoId;
	}

	public String getAssoName() {
		return this.assoName;
	}

	public void setAssoName(String assoName) {
		this.assoName = assoName;
	}

	public String getAssoPosition() {
		return this.assoPosition;
	}

	public void setAssoPosition(String assoPosition) {
		this.assoPosition = assoPosition;
	}

	public Integer getAssoPersonNum() {
		return this.assoPersonNum;
	}

	public void setAssoPersonNum(Integer assoPersonNum) {
		this.assoPersonNum = assoPersonNum;
	}

	public String getAssoResClass() {
		return this.assoResClass;
	}

	public void setAssoResClass(String assoResClass) {
		this.assoResClass = assoResClass;
	}

	public String getAssoResPhone() {
		return this.assoResPhone;
	}

	public void setAssoResPhone(String assoResPhone) {
		this.assoResPhone = assoResPhone;
	}

	public String getAssoResName() {
		return this.assoResName;
	}

	public void setAssoResName(String assoResName) {
		this.assoResName = assoResName;
	}

	public String getAssoIntroduce() {
		return this.assoIntroduce;
	}

	public void setAssoIntroduce(String assoIntroduce) {
		this.assoIntroduce = assoIntroduce;
	}

}