package br.com.rabbitmqapiproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.rabbitmqapiproducer.dto.Person;
import br.com.rabbitmqapiproducer.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping("/send")
	public void sendToConsumer(@RequestBody Person person) {
		personService.sendToConsumer(person);
	}
}
