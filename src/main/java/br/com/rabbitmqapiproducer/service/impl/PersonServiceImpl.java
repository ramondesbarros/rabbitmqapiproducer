package br.com.rabbitmqapiproducer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rabbitmqapiproducer.amqp.PersonProducer;
import br.com.rabbitmqapiproducer.dto.Person;
import br.com.rabbitmqapiproducer.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonProducer<Person> personProducer;

	@Override
	public void sendToConsumer(Person person) {

		personProducer.producer(person);
	}
}
