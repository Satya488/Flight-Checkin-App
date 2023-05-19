package com.Flight_Checkin.Integration.Dto;

public class ReservationUpdateRequest {
private long id;
private int numberOfBags;
private boolean checkedInStatus;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getNumberOfBags() {
	return numberOfBags;
}
public void setNumberOfBags(int numberOfBags) {
	this.numberOfBags = numberOfBags;
}
public boolean isCheckedInStatus() {
	return checkedInStatus;
}
public void setCheckedInStatus(boolean checkedInStatus) {
	this.checkedInStatus = checkedInStatus;
}

}
