package entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Associationactivitylist entity. @author MyEclipse Persistence Tools
 */


public class Associationactivitylist implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private String activityName;
	private String activityPosition;
	private Integer activityPersonNum;
	private Date activityTime;
	private String activityContent;
	private String association;

	// Constructors

	/** default constructor */
	public Associationactivitylist() {
	}

	/** minimal constructor */
	public Associationactivitylist(String activityName,
			String activityPosition, Date activityTime) {
		this.activityName = activityName;
		this.activityPosition = activityPosition;
		this.activityTime = activityTime;
	}

	/** full constructor */
	public Associationactivitylist(String activityName,
			String activityPosition, Integer activityPersonNum,
			Date activityTime, String activityContent, String association) {
		this.activityName = activityName;
		this.activityPosition = activityPosition;
		this.activityPersonNum = activityPersonNum;
		this.activityTime = activityTime;
		this.activityContent = activityContent;
		this.association = association;
	}

	// Property accessors

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityPosition() {
		return this.activityPosition;
	}

	public void setActivityPosition(String activityPosition) {
		this.activityPosition = activityPosition;
	}

	public Integer getActivityPersonNum() {
		return this.activityPersonNum;
	}

	public void setActivityPersonNum(Integer activityPersonNum) {
		this.activityPersonNum = activityPersonNum;
	}

	public Date getActivityTime() {
		return this.activityTime;
	}

	public void setActivityTime(Date activityTime) {
		this.activityTime = activityTime;
	}

	public String getActivityContent() {
		return this.activityContent;
	}

	public void setActivityContent(String activityContent) {
		this.activityContent = activityContent;
	}

	public String getAssociation() {
		return this.association;
	}

	public void setAssociation(String association) {
		this.association = association;
	}

}