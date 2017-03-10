package entity;

import java.util.Date;


/**
 * Associationinformation entity. @author MyEclipse Persistence Tools
 */


public class Associationinformation implements java.io.Serializable {

	// Fields

	private Integer assoId;
	private String assoName;
	private String assoPosition;
	private Integer assoPersonNum;
	private Date assoBuildDate;
	private String assoResName;
	private String assoIntroduce;

	// Constructors

	/** default constructor */
	public Associationinformation() {
	}

	/** full constructor */
	public Associationinformation(String assoName, String assoPosition,
			Integer assoPersonNum, Date assoBuildDate, String assoResName,
			String assoIntroduce) {
		this.assoName = assoName;
		this.assoPosition = assoPosition;
		this.assoPersonNum = assoPersonNum;
		this.assoBuildDate = assoBuildDate;
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

	public Date getAssoBuildDate() {
		return this.assoBuildDate;
	}

	public void setAssoBuildDate(Date assoBuildDate) {
		this.assoBuildDate = assoBuildDate;
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