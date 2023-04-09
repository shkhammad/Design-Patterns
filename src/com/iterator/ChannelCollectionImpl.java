package com.iterator;
import java.util.*;

public class ChannelCollectionImpl implements ChannelCollection{

	private List<Channel> channels;
	
	public ChannelCollectionImpl() {
		channels = new ArrayList<>();
	}
	
	@Override
	public void addChannel(Channel channel) {
		channels.add(channel);
	}

	@Override
	public void removeChannel(Channel channel) {
		channels.remove(channel);
	}

	@Override
	public ChannelIterator iterator(ChannelType channelType) {
		return new ChannelIteratorImpl(channelType, channels);
	}
	
	private static class ChannelIteratorImpl implements ChannelIterator{
		
		private ChannelType channelType;
		private List<Channel> channels;
		private int index;
		
		public ChannelIteratorImpl(ChannelType channelType, List<Channel> channels) {
			this.channelType = channelType;
			this.channels = channels;
			this.index = 0;
		}
		
		@Override
		public boolean hasNext() {
			int n = channels.size();
			
			while(index < n) {
				
				if((this.channelType.equals(ChannelType.ALL)) || (channels.get(index).getChannelType().equals(this.channelType))) 
					return true;
				 
				
				++index;
			}
			
			return false;
		}

		@Override
		public Channel next() {
			return  channels.get(index++);
		}
		
	}
	
}
