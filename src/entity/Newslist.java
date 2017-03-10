package entity;

import java.util.Date;


/**
 * Newslist entity. @author MyEclipse Persistence Tools
 */


public class Newslist implements java.io.Serializable {

	// Fields

	private Integer newsId;
	private Date newsDate;
	private String newsCurrentAddress;
	private String newsAuthor;
	private String newsContent;
	private String newsTitle;

	// Constructors

	/** default constructor */
	public Newslist() {
	}

	/** full constructor */
	public Newslist(Date newsDate, String newsCurrentAddress,
			String newsAuthor, String newsContent, String newsTitle) {
		this.newsDate = newsDate;
		this.newsCurrentAddress = newsCurrentAddress;
		this.newsAuthor = newsAuthor;
		this.newsContent = newsContent;
		this.newsTitle = newsTitle;
	}

	// Property accessors

	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public Date getNewsDate() {
		return this.newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	public String getNewsCurrentAddress() {
		return this.newsCurrentAddress;
	}

	public void setNewsCurrentAddress(String newsCurrentAddress) {
		this.newsCurrentAddress = newsCurrentAddress;
	}

	public String getNewsAuthor() {
		return this.newsAuthor;
	}

	public void setNewsAuthor(String newsAuthor) {
		this.newsAuthor = newsAuthor;
	}

	public String getNewsContent() {
		return this.newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public String getNewsTitle() {
		return this.newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

}