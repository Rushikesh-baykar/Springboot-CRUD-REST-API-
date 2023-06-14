package com.app.student.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@Column(name="end_year", nullable=true)
	private String end_year;
	private Double citylng;
	private Double citylat;
	private int intensity;
	private String sector;
	private String topic;
	private String insight;
	private String swot;
	private String url;
	private String region;
	private String start_year;
	private int impact;
	private Date added;
	private Date published;
	private String city;
	private String country;
	private int relevance;
	private String pestle;
	private String source;
	
	 @Column(name = "title", length = 65534)
	private String title;
	private int likelihood;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnd_year() {
		return end_year;
	}

	public void setEnd_year(String end_year) {
		this.end_year = end_year;
	}

	public Double getCitylng() {
		return citylng;
	}

	public void setCitylng(Double citylng) {
		this.citylng = citylng;
	}

	public Double getCitylat() {
		return citylat;
	}

	public void setCitylat(Double citylat) {
		this.citylat = citylat;
	}

	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getInsight() {
		return insight;
	}

	public void setInsight(String insight) {
		this.insight = insight;
	}

	public String getSwot() {
		return swot;
	}

	public void setSwot(String swot) {
		this.swot = swot;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStart_year() {
		return start_year;
	}

	public void setStart_year(String start_year) {
		this.start_year = start_year;
	}

	public int getImpact() {
		return impact;
	}

	public void setImpact(int impact) {
		this.impact = impact;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getRelevance() {
		return relevance;
	}

	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}

	public String getPestle() {
		return pestle;
	}

	public void setPestle(String pestle) {
		this.pestle = pestle;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLikelihood() {
		return likelihood;
	}

	public void setLikelihood(int likelihood) {
		this.likelihood = likelihood;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", end_year=" + end_year + ", citylng=" + citylng + ", citylat=" + citylat
				+ ", intensity=" + intensity + ", sector=" + sector + ", topic=" + topic + ", insight=" + insight
				+ ", swot=" + swot + ", url=" + url + ", region=" + region + ", start_year=" + start_year + ", impact="
				+ impact + ", added=" + added + ", published=" + published + ", city=" + city + ", country=" + country
				+ ", relevance=" + relevance + ", pestle=" + pestle + ", source=" + source + ", title=" + title
				+ ", likelihood=" + likelihood + "]";
	}

}
