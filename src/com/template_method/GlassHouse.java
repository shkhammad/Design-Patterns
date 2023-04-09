package com.template_method;

public class GlassHouse extends House{

	@Override
	public void buildWalls() {
		System.out.println("Building the walls with brick and steel");	
	}

	@Override
	public void buildWindows() {
		System.out.println("Building the windows with glass");
	}
	
	
}
