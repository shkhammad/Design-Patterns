package com.iterator;

public class Test {
	
	public static void main(String[] args) {
		
		//iterator design-pattern
		//Iterator pattern is useful when you want to provide 
		//a standard way to iterate over a collection and hide 
		//the implementation logic from client program.
		
		ChannelCollection channelCollection = new ChannelCollectionImpl();
		channelCollection.addChannel(new Channel(100.1,ChannelType.ENGLISH));
		channelCollection.addChannel(new Channel(98.3,ChannelType.HINDI));
		channelCollection.addChannel(new Channel(94.3,ChannelType.HINDI));
		channelCollection.addChannel(new Channel(91.1,ChannelType.HINDI));
		channelCollection.addChannel(new Channel(92.7,ChannelType.HINDI));
		
		ChannelIterator channelIterator = channelCollection.iterator(ChannelType.HINDI);
		
		while(channelIterator.hasNext()) 
			System.out.println(channelIterator.next());
		
		
	}
}
