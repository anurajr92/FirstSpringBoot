package com.springboot.controller;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.TopicService;
import com.springboot.topic.Topic;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value="/topic")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopic();
	}
	
	@RequestMapping(value="/topic/{id}")
	public Topic getIndividaualTopic(@PathVariable("id") String id) {
		System.out.println("id is-->"+id);
		return topicService.getIndidualTopic(id);
	}
	
	@RequestMapping(value="/top")
	public String getTopicInst() {
		return topicService.getTopicIntance();
	}
	
	@RequestMapping(value="/topic/{id}", method=RequestMethod.DELETE)
	public String deleteTopic(@PathVariable("id") String id) {
		System.out.println("id is-->"+id);
		return topicService.deleteTopic(id);
	}
	
	@RequestMapping(value="/topic", method=RequestMethod.POST)
	public String addTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}

	
	@RequestMapping(value="/topic", method=RequestMethod.PUT)
	public String updateTopic(@RequestBody Topic topic) {
		return topicService.updateTopic(topic);
	}
}
