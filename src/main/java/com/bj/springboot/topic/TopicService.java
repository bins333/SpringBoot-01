package com.bj.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	final static Logger logger = Logger.getLogger(TopicService.class);
	
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("spring", "Spring core", "spring topics"),
			new Topic("java", " Core Java", "Java Detais"),
			new Topic("javaScript", "Java Script", "Java Script topics")));

	public List<Topic> getTopics() {
		logger.info("Get all topics");
		return topics;
	}

	public Topic getTopic(String topicId) {
		logger.info("Get topics" + topicId);
		return topics.stream().filter(t -> t.getId().equals(topicId)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		logger.info("Adding new topic to topics");
		topics.add(topic);

	}

	public void updateTopic(Topic topic, String id) {
		logger.info("Updating a topic " + id);
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}

	}

	public void delectTopic(String id) {
		logger.info("Deleting topic "+ id);
		topics.removeIf(obj -> obj.getId().equals(id));

	}

}
