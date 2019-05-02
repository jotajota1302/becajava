package com.es.eoi.booking;

public class Bus extends Transport implements Cancelable {

	private String code;

	private int floors;

	private boolean wc;

	public Bus() {
		super.seatMap = new char[30][4];
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isWc() {
		return wc;
	}

	public void setWc(boolean wc) {
		this.wc = wc;
	}

	@Override
	public String toString() {
		return "Bus [code=" + code + ", floors=" + floors + ", wc=" + wc + "]";
	}

}
