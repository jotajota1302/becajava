package com.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Airplane extends Transport {

	private String code;
	private int flight;
	private String model;
	private String brand;

}
