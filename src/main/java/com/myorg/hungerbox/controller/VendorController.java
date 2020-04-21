package com.myorg.hungerbox.controller;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorController {
		
	public class EMIController {
		
		@Autowired
		JobLauncher  launcher;
		
		@Autowired
		Job job;

	}


}
