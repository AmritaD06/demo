package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "policy", schema = "pol")
public class Policy implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyId;

	// @NotEmpty(message = "Please provide a policyNo")
	private long policyNo;

	// @NotEmpty(message = "Please provide a policyName")
	// @Size(min=2, max=30)
	private String policyName;
	private String insuranceProvider;
	private double premium;
	private String description;
	private String coverType;
	private double cover;
	private String policyTenure;
	private int age;
	private String claim;
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public long getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(long policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getInsuranceProvider() {
		return insuranceProvider;
	}
	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCoverType() {
		return coverType;
	}
	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}
	public double getCover() {
		return cover;
	}
	public void setCover(double cover) {
		this.cover = cover;
	}
	public String getPolicyTenure() {
		return policyTenure;
	}
	public void setPolicyTenure(String policyTenure) {
		this.policyTenure = policyTenure;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClaim() {
		return claim;
	}
	public void setClaim(String claim) {
		this.claim = claim;
	}
	public Policy(int policyId, long policyNo, String policyName, String insuranceProvider, double premium,
			String description, String coverType, double cover, String policyTenure, int age, String claim) {
		super();
		this.policyId = policyId;
		this.policyNo = policyNo;
		this.policyName = policyName;
		this.insuranceProvider = insuranceProvider;
		this.premium = premium;
		this.description = description;
		this.coverType = coverType;
		this.cover = cover;
		this.policyTenure = policyTenure;
		this.age = age;
		this.claim = claim;
	}
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyNo=" + policyNo + ", policyName=" + policyName
				+ ", insuranceProvider=" + insuranceProvider + ", premium=" + premium + ", description=" + description
				+ ", coverType=" + coverType + ", cover=" + cover + ", policyTenure=" + policyTenure + ", age=" + age
				+ ", claim=" + claim + "]";
	}
	


}
