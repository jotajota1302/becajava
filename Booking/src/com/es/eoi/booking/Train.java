package com.es.eoi.booking;

public class Train extends Transport {

	private int wagon;

	private String type;

	public Train() {
		super.seatMap = new char[8][4];
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String reserveRandomSeat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reserveSeat(char x, char y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cancelSeat(char x, char y) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getWagon() {
		return wagon;
	}

	public void setWagon(int wagon) {
		this.wagon = wagon;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Train [wagon=" + wagon + ", type=" + type + "]";
	}

}
