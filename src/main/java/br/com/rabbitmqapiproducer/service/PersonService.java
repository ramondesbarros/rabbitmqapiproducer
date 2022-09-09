package br.com.rabbitmqapiproducer.service;

import br.com.rabbitmqapiproducer.dto.Person;

public interface PersonService {

	void sendToConsumer(Person person);
}
