package com.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.topic.Topic;

@Service
public class TopicService {
	
	private String topic = "Hello ANuraj";
	private static List<Topic> topics =new ArrayList<>( Arrays.asList(
			new Topic("1", "Java"),
			new Topic("2", "Angular")
			));
	
	public String getTopicIntance()
	{
		return topic;
	}
	
	public List<Topic> getAllTopic()
	{
		return topics;
	}

	public Topic getIndidualTopic(String id) {
		for(Topic topic:topics)
		{
			if(topic.getTopicId().equals(id))
			{
				return topic;
			}
		}
		return null;
	}
	
	public String deleteTopic(String id)
	{
		topics.removeIf(topic -> topic.getTopicId().equals(id));
		return String.valueOf(topics.size());
	}

	public String addTopic(Topic topic)
	{
		topics.add(topic);
			return String.valueOf(topics.size());
	}
	
	public String updateTopic(Topic topic)
	{
		for(int i=0; i<topics.size(); i++)
		{
			if(topics.get(i).getTopicId().equals(topic.getTopicId()))
			{
				topics.set(i, topic);
				return "Updated";
			}
		}
		return "Not found";
	}

}
