package com.builder;

public class Main {
	
	public static void main(String[] args) {
		
		//Builder pattern is an important and widely used design-pattern
		//It employs method chaining and is great for objects having large
		//number of attributes (dividing them into required and optional attributes)
		PC pc1 = new PC
				.PCBuilder("Intel", 8, 512)
				.setGpu("NVidia")
				.setOledDisplay(true)
				.build();
		
		System.out.println(pc1.getCpu());
		System.out.println(pc1.getRam());
		System.out.println(pc1.getHdd());
		System.out.println(pc1.getGpu());
		System.out.println(pc1.getOledDisplay());
		
		PC pc2 = new PC
				.PCBuilder("AMD", 16, 1024)
				.setGpu("NVidia-Ti")
				.setOledDisplay(false)
				.build();
		
		System.out.println(pc2.getCpu());
		System.out.println(pc2.getRam());
		System.out.println(pc2.getHdd());
		System.out.println(pc2.getGpu());
		System.out.println(pc2.getOledDisplay());
		
		
		
	}
}
