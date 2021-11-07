package com.jpn.kc.ontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

	@GetMapping("/v1/hello")
	@PreAuthorize("hasRole('api-user')")
	public ResponseEntity<?> getMessage() {
		return new ResponseEntity<String>("Hi There!!!!", HttpStatus.OK);
	}

}
