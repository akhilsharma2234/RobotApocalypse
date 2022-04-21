package com.robot.apocalypse.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.robot.apocalypse.model.Robot;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RobotClientService {

	private RestTemplate restTemplate;

	private static final String URL = "https://robotstakeover20210903110417.azurewebsites.net/robotcpu";

	@Autowired
	public RobotClientService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public List<Robot> getRobotDetails() {
		log.info("Get Robot CPU Client Details");
		ResponseEntity<Robot[]> responseEntity = restTemplate.getForEntity(URL, Robot[].class);
		return Arrays.asList(responseEntity.getBody());
	}
}
