package com.template_method;

public class WoodenHouse extends House{

	@Override
	public void buildWalls() {
		System.out.println("Building the walls with brick and aluminium");
	}

	@Override
	public void buildWindows() {
		System.out.println("Building the windows with wood");
	}

}
