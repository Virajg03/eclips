package com.hibernate;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "student_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addessId;

	@Column(length = 50, name = "STREET")
	private String street;

	@Column(length = 100, name = "CITY")
	private String City;

	@Column(name = "is_open")
	private boolean isOpen;

	@Transient
	private double x;

	@Column(name = "added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;

	@Lob
	@Column(name = "image", columnDefinition = "LONGBLOB")
	private byte[] image;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addessId, String street, String city, boolean osOpen, double x, Date addedDate, byte[] image) {
		super();
		this.addessId = addessId;
		this.street = street;
		City = city;
		this.isOpen = osOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}

	public int getAddessId() {
		return addessId;
	}

	public void setAddessId(int addessId) {
		this.addessId = addessId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public boolean isIsOpen() {
		return isOpen;
	}

	public void setIsOpen(boolean osOpen) {
		this.isOpen = osOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return new Date();
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Address [addessId=" + addessId + ", street=" + street + ", City=" + City + ", isOpen=" + isOpen + ", x="
				+ x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}

}
