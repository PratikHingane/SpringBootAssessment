package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "tblassetdefination")
public class AssetDefination {
	// instance variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer assetDefinationId;

	@Column(nullable = false)
	private String assetDefinationName;

	private String assetDefinationClass;
	private Integer assetTypeId;
	
	@ManyToOne
	@JoinColumn(name="assetTypeId",insertable = false,updatable = false)
	private AssetType assetType;

	// default constr
	public AssetDefination() {
		
	}

	//parameterized constr
	public AssetDefination(Integer assetDefinationId, String assetDefinationName, String assetDefinationClass,
			Integer assetTypeId, AssetType assetType) {
		
		this.assetDefinationId = assetDefinationId;
		this.assetDefinationName = assetDefinationName;
		this.assetDefinationClass = assetDefinationClass;
		this.assetTypeId = assetTypeId;
		this.assetType = assetType;
	}

	//getters & setters
	public Integer getAssetDefinationId() {
		return assetDefinationId;
	}

	public void setAssetDefinationId(Integer assetDefinationId) {
		this.assetDefinationId = assetDefinationId;
	}

	public String getAssetDefinationName() {
		return assetDefinationName;
	}

	public void setAssetDefinationName(String assetDefinationName) {
		this.assetDefinationName = assetDefinationName;
	}

	public String getAssetDefinationClass() {
		return assetDefinationClass;
	}

	public void setAssetDefinationClass(String assetDefinationClass) {
		this.assetDefinationClass = assetDefinationClass;
	}

	public Integer getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(Integer assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	@JsonBackReference
	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	//override toString()
	@Override
	public String toString() {
		return "AssetDefination [assetDefinationId=" + assetDefinationId + ", assetDefinationName="
				+ assetDefinationName + ", assetDefinationClass=" + assetDefinationClass + ", assetTypeId="
				+ assetTypeId + ", assetType=" + assetType + "]";
	}
	
	
}
