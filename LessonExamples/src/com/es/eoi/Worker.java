package com.es.eoi;

public class Worker extends PersonInformation {
		
	static final double CONSTANTE=100.0;
	
	private Double salary;
	
	
	
	public Worker() {
		super();
	}

	public Worker(Double salary) {
		super();
		this.salary = salary;
	}

	public Worker(Double salary,String nif) {
		super();
		super.setNif(nif);
		this.salary = salary;
	}
	
	public void work(){
		System.out.println("este tio curra");
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}
