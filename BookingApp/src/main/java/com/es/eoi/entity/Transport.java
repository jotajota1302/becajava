package com.es.eoi.entity;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Transport {
	
	private int capacity;
	
	public List<Seat> seatList;
	
	private Date creationDate;
	
	private double price;	
	
	
	
}
