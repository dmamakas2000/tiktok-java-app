// This is a publisher interface - Represents a general Publisher

import java.util.ArrayList;

public interface PublisherInterface extends Node {
	
	public void addHashTag(String hashtag);
	
	public void removeHashTag(String hashtag);
	
	public Message hashTopic(String key);
	
	public void push(String key, Value video);
	
	public void notifyFailure(Broker b);
	
	public void notifyBrokersForHashTags(String type, String hashtag);
	
	public ArrayList<Value> generateChunks(String video);

}
