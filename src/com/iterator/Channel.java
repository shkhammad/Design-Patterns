package com.iterator;

public class Channel {
	private double frequency;
	private ChannelType channelType;
	
	public Channel(double frequency, ChannelType channelType) {
		this.frequency = frequency;
		this.channelType = channelType;
	}
	
	public double getFrequency() {
		return this.frequency;
	}

	public ChannelType getChannelType() {
		return this.channelType;
	}

	@Override
	public String toString() {
		return "Channel [frequency=" + frequency + ", channelType=" + channelType + "]";
	}
	
}
