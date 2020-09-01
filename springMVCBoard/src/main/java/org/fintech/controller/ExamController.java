package org.fintech.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/exam")
@Log4j
public class ExamController {
	@GetMapping(value = "/test1", produces = "text/plain; charset = UTF-8")
	public String test1() {
		log.info("MIME TYPE: " + MediaType.TEXT_PLAIN_VALUE);

		return "exam test1 page";
	}

	@GetMapping(value = "/test2", produces = "text/plain; charset = UTF-8")
	public String test2() {
		log.info("MIME TYPE: " + MediaType.TEXT_PLAIN_VALUE);

		return "exam test2 page";
	}

	@GetMapping(value = "/test3", produces = "text/plain; charset = UTF-8")
	public String test3() {
		log.info("MIME TYPE: " + MediaType.TEXT_PLAIN_VALUE);

		return "exam test3 page";
	}
}