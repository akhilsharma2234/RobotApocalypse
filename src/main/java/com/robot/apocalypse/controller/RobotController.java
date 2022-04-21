package com.robot.apocalypse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robot.apocalypse.model.LocationDTO;
import com.robot.apocalypse.model.Report;
import com.robot.apocalypse.model.SurvivorDTO;
import com.robot.apocalypse.service.RobotService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "api/survivors", produces = MediaType.APPLICATION_JSON_VALUE)
public class RobotController {

	@Autowired
	private RobotService robotService;

	@PostMapping("/register")
	public ResponseEntity<SurvivorDTO> registerSurvivor(@RequestBody SurvivorDTO survivorDTO) {
		log.info("Registering Survivor");
		ResponseEntity<SurvivorDTO> survivorResponseEntity = new ResponseEntity<>(
				robotService.registerSurvivor(survivorDTO), HttpStatus.OK);
		log.info("Finished Registering Survivor");
		return survivorResponseEntity;
	}

	@GetMapping
	public ResponseEntity<List<SurvivorDTO>> getAllSurvivorDetails() {
		log.info("Getting All Survivor Details");
		ResponseEntity<List<SurvivorDTO>> survivorsResponseEntity = new ResponseEntity<>(robotService.getAllSurvivor(),
				HttpStatus.OK);
		log.info("Got All Survivor Details");
		return survivorsResponseEntity;
	}

	@GetMapping("/{id}")
	public ResponseEntity<SurvivorDTO> getSurvivor(@PathVariable Long id) {
		log.info("Getting Survivor by ID");
		ResponseEntity<SurvivorDTO> survivorResponseEntity = new ResponseEntity<>(robotService.getSurvivor(id),
				HttpStatus.OK);
		log.info("Got Survivor by ID");
		return survivorResponseEntity;
	}

	@PutMapping("/{id}/location")
	public ResponseEntity<Object> updateSurvivorLocation(@PathVariable Long id, @RequestBody LocationDTO locationDTO) {
		log.info("Updating Survivor location");
		robotService.updateSurvivorLocation(id, locationDTO);
		log.info("Survivor location Updated");
		return ResponseEntity.accepted().build();
	}

	@PutMapping("/{id}/reportInfection/{reportInfectionId}")
	public ResponseEntity<Object> setFlagAsInfected(@PathVariable Long id, @PathVariable Long reportInfectionId) {
		log.info("Setting Survivor as Infected");
		robotService.reportSurvivorAsInfected(id, reportInfectionId);
		log.info("Survivor set as Infected");
		return ResponseEntity.accepted().build();
	}

	@GetMapping("/reports")
	public ResponseEntity<Report> getReport() {
		log.info("Getting the Report");
		ResponseEntity<Report> reportResponseEntity = new ResponseEntity<>(robotService.getReport(), HttpStatus.OK);
		log.info("Got the Report");
		return reportResponseEntity;
	}
}
