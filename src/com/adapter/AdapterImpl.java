package com.adapter;

//adapter class
//customized as per our needs
public class AdapterImpl extends Socket implements Adapter{
	
	private Volt volt = get120V();
	
	@Override
	public Volt get3V() {
		return new Volt(volt.getVolts()/40);
	}

	@Override
	public Volt get40V() {
		return new Volt(volt.getVolts()/3);
	}
	
}
