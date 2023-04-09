package com.builder;

public class PC {
	
	//required attributes
	private String cpu;
	private int ram,hdd;
	
	//optional attributes
	private String gpu;
	private boolean oledDisplay;
	
	public String getCpu() {
		return this.cpu;
	}

	public int getRam() {
		return this.ram;
	}

	public int getHdd() {
		return this.hdd;
	}

	public String getGpu() {
		return this.gpu;
	}

	public boolean getOledDisplay() {
		return this.oledDisplay;
	}
	
	private PC(PCBuilder pcBuilder) {
		this.cpu = pcBuilder.cpu;
		this.ram = pcBuilder.ram;
		this.hdd = pcBuilder.hdd;
		this.gpu = pcBuilder.gpu;
		this.oledDisplay = pcBuilder.oledDisplay;
	}
	
	public static class PCBuilder {
		
		//required attributes
		private String cpu;
		private int ram,hdd;
		
		//optional attributes
		private String gpu;
		private boolean oledDisplay;
		
		public PCBuilder(String cpu, int ram, int hdd) {
			this.cpu = cpu;
			this.ram = ram;
			this.hdd = hdd;
		}
		
		public PCBuilder setGpu(String gpu) {
			this.gpu = gpu;
			return this;
		}
		
		public PCBuilder setOledDisplay(boolean oledDisplay) {
			this.oledDisplay = oledDisplay;
			return this;
		}
		
		public PC build() {
			return new PC(this); 
		}
	}
	
}
