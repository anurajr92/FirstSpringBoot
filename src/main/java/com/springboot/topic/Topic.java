package com.springboot.topic;

public class Topic {

	private String topicId;
	
	private String topic;

	public Topic(String topicId,String topic) {
		
		this.topicId = topicId;
		this.topic = topic;
		
		
	}
	
	public Topic()
	{
		
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	
}
