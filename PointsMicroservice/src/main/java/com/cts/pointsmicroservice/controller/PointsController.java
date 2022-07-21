package com.cts.pointsmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pointsmicroservice.exception.InvalidUserException;
import com.cts.pointsmicroservice.exception.MicroserviceException;
import com.cts.pointsmicroservice.service.PointsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PointsController {

	@Autowired
	PointsService pointsService;

	@GetMapping("/")
	public String healthCheck() {
		return "Health Check Ok";
	}
	@GetMapping("/getpointsbyemp/{id}")
	public ResponseEntity<Integer> getPointsByEmpId(@RequestHeader(name = "Authorization") String token,
			@PathVariable("id") int id) throws MicroserviceException {
		log.info("Inside getpointsbyemployeeid of points microservice");
		return new ResponseEntity<>(pointsService.getPoints(token, id), HttpStatus.OK);
	}

	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/refreshpointsbyemp/{id}")
	public ResponseEntity<?> refreshPointsByEmpId(@RequestHeader(name = "Authorization") String token,
			@PathVariable("id") int id) throws InvalidUserException, MicroserviceException {
		log.info("Inside refreshpoints of points microservice");
		return new ResponseEntity<>(pointsService.refreshPoints(token, id), HttpStatus.OK);
	}

}
