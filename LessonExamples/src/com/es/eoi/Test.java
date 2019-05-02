package com.es.eoi;

public class Test {
	
	
	public String atributoPublic;
	
	private String atributoPrivate;
	
	protected String atributoProtected;
	
	private boolean holiday;
	
	
		
	public boolean isHoliday() {
		return holiday;
	}

	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}

	public String sayHello() {
		
		return "hello from parent";
		
	}

	public String getAtributoPublic() {
		return atributoPublic;
	}

	public void setAtributoPublic(String atributoPublic) {
		this.atributoPublic = atributoPublic;
	}

	public String getAtributoPrivate() {
		return atributoPrivate;
	}

	public void setAtributoPrivate(String atributoPrivate) {
		this.atributoPrivate = atributoPrivate;
	}

	public String getAtributoProtected() {
		return atributoProtected;
	}

	public void setAtributoProtected(String atributoProtected) {
		this.atributoProtected = atributoProtected;
	}

	@Override
	public String toString() {
		return "Test [atributoPublic=" + atributoPublic + ", atributoPrivate=" + atributoPrivate
				+ ", atributoProtected=" + atributoProtected + "] from TEST";
	}
	
	

}
