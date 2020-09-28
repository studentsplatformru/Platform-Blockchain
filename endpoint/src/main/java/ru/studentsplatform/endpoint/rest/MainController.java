package ru.studentsplatform.endpoint.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Krylov Sergey (27.09.2020)
 */
@RestController("/")
public class MainController {
	@GetMapping
	public String mainPage() {
		return "Main page";
	}
}
