package com.ams.AirlineManagementSystem.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "flightpf")
public class Flight {

    @Id
    @Column(name = "fltId", length = 5)
    private String fltId;

    public String getFltId() {
		return fltId;
	}

	public void setFltId(String fltId) {
		this.fltId = fltId;
	}

	public String getAirId() {
		return airId;
	}

	public void setAirId(String airId) {
		this.airId = airId;
	}

	public Integer getFltRange() {
		return fltRange;
	}

	public void setFltRange(Integer fltRange) {
		this.fltRange = fltRange;
	}

	public Integer getFltFuelCap() {
		return fltFuelCap;
	}

	public void setFltFuelCap(Integer fltFuelCap) {
		this.fltFuelCap = fltFuelCap;
	}

	public String getAirModel() {
		return airModel;
	}

	public void setAirModel(String airModel) {
		this.airModel = airModel;
	}

	public Integer getFltTotSeat() {
		return fltTotSeat;
	}

	public void setFltTotSeat(Integer fltTotSeat) {
		this.fltTotSeat = fltTotSeat;
	}

	public String getFltOrigin() {
		return fltOrigin;
	}

	public void setFltOrigin(String fltOrigin) {
		this.fltOrigin = fltOrigin;
	}

	public String getFltDest() {
		return fltDest;
	}

	public void setFltDest(String fltDest) {
		this.fltDest = fltDest;
	}

	public Double getFltTkPrice() {
		return fltTkPrice;
	}

	public void setFltTkPrice(Double fltTkPrice) {
		this.fltTkPrice = fltTkPrice;
	}

	public LocalTime getFltArrTime() {
		return fltArrTime;
	}

	public void setFltArrTime(LocalTime fltArrTime) {
		this.fltArrTime = fltArrTime;
	}

	public LocalTime getFltDepTime() {
		return fltDepTime;
	}

	public void setFltDepTime(LocalTime fltDepTime) {
		this.fltDepTime = fltDepTime;
	}

	public LocalTime getFltEndTime() {
		return fltEndTime;
	}

	public void setFltEndTime(LocalTime fltEndTime) {
		this.fltEndTime = fltEndTime;
	}

	public LocalTime getFltTotDur() {
		return fltTotDur;
	}

	public void setFltTotDur(LocalTime fltTotDur) {
		this.fltTotDur = fltTotDur;
	}

	public Integer getFltCabBag() {
		return fltCabBag;
	}

	public void setFltCabBag(Integer fltCabBag) {
		this.fltCabBag = fltCabBag;
	}

	public Integer getFltMainBag() {
		return fltMainBag;
	}

	public void setFltMainBag(Integer fltMainBag) {
		this.fltMainBag = fltMainBag;
	}

	public String getFltStatus() {
		return fltStatus;
	}

	public void setFltStatus(String fltStatus) {
		this.fltStatus = fltStatus;
	}

	public String getFltRemark() {
		return fltRemark;
	}

	public void setFltRemark(String fltRemark) {
		this.fltRemark = fltRemark;
	}

	@Column(name = "airId", length = 5)
    private String airId;

    @Column(name = "fltRange")
    private Integer fltRange;

    @Column(name = "fltFuelCap")
    private Integer fltFuelCap;

    @Column(name = "airModel", length = 5)
    private String airModel;

    @Column(name = "fltTotSeat")
    private Integer fltTotSeat;

    @Column(name = "fltOrigin", length = 20)
    private String fltOrigin;

    @Column(name = "fltDest", length = 20)
    private String fltDest;

    @Column(name = "fltTkPrice")
    private Double fltTkPrice;

    @Column(name = "fltArrTime")
    private LocalTime fltArrTime;

    @Column(name = "fltDepTime")
    private LocalTime fltDepTime;

    @Column(name = "fltEndTime")
    private LocalTime fltEndTime;

    @Column(name = "fltTotDur")
    private LocalTime fltTotDur;

    @Column(name = "fltCabBag")
    private Integer fltCabBag;

    @Column(name = "fltMainBag")
    private Integer fltMainBag;

    @Column(name = "fltStatus", length = 1)
    private String fltStatus; // A or I

    @Column(name = "fltRemark", length = 15)
    private String fltRemark;

    // Generate getters & setters
}