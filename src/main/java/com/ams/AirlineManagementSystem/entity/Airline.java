package com.ams.AirlineManagementSystem.entity;

import jakarta.persistence.*;
//import java.time.LocalDate;

	@Entity
	@Table(name = "airmaster")  // agar table name alag hai toh change karna
	public class Airline {

	    @Id
	    @Column(name = "airId")
	    private String airId;

	    public String getAirId() {
			return airId;
		}

		public void setAirId(String airId) {
			this.airId = airId;
		}

		public String getAirName() {
			return airName;
		}

		public void setAirName(String airName) {
			this.airName = airName;
		}

		public String getAirMobNum() {
			return airMobNum;
		}

		public void setAirMobNum(String airMobNum) {
			this.airMobNum = airMobNum;
		}

		public String getAirEmail() {
			return airEmail;
		}

		public void setAirEmail(String airEmail) {
			this.airEmail = airEmail;
		}

		public String getAirPinCode() {
			return airPinCode;
		}

		public void setAirPinCode(String airPinCode) {
			this.airPinCode = airPinCode;
		}

		public String getAirAddress() {
			return airAddress;
		}

		public void setAirAddress(String airAddress) {
			this.airAddress = airAddress;
		}

		public String getAirCity() {
			return airCity;
		}

		public void setAirCity(String airCity) {
			this.airCity = airCity;
		}

		public String getAirState() {
			return airState;
		}

		public void setAirState(String airState) {
			this.airState = airState;
		}

		public String getAirCountry() {
			return airCountry;
		}

		public void setAirCountry(String airCountry) {
			this.airCountry = airCountry;
		}

		public String getAirFleet() {
			return airFleet;
		}

		public void setAirFleet(String airFleet) {
			this.airFleet = airFleet;
		}

		public String getAirEstDate() {
			return airEstDate;
		}

		public void setAirEstDate(String airEstDate) {
			this.airEstDate = airEstDate;
		}

		public String getAirRating() {
			return airRating;
		}

		public void setAirRating(String airRating) {
			this.airRating = airRating;
		}

		public String getAirStatus() {
			return airStatus;
		}

		public void setAirStatus(String airStatus) {
			this.airStatus = airStatus;
		}

		public String getAirRemark() {
			return airRemark;
		}

		public void setAirRemark(String airRemark) {
			this.airRemark = airRemark;
		}

		@Column(name = "airName")
	    private String airName;

	    @Column(name = "airMobNum")
	    private String airMobNum;

	    @Column(name = "airEmail")
	    private String airEmail;

	    @Column(name = "airPinCode")
	    private String airPinCode;

	    @Column(name = "airAddress")
	    private String airAddress;

	    @Column(name = "airCity")
	    private String airCity;

	    @Column(name = "airState")
	    private String airState;

	    @Column(name = "airCountry")
	    private String airCountry;

	    @Column(name = "airFleet")
	    private String airFleet;

	    @Column(name = "airEstDate")
	    private String airEstDate;

	    @Column(name = "airRating")
	    private String airRating;

	    @Column(name = "airStatus")
	    private String airStatus;

	    @Column(name = "airRemark")
	    private String airRemark;

	    // Generate getters & setters (Alt + Insert in IntelliJ)
	}

