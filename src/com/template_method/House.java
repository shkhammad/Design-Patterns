package com.template_method;

public abstract class House {
	
	//template-method 
	//consists of certain steps whose order is fixed
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
	}
	
	private void buildFoundation() {
		System.out.println("Building the foundation with cement, iron and sand");
	}
	
	private void buildPillars() {
		System.out.println("Building the pillars with strong cement");
	}
	
	//sub-classes can customize / override this
	public abstract void buildWalls();
	public abstract void buildWindows();
}
