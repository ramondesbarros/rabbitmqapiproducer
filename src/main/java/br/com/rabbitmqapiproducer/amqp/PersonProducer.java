package br.com.rabbitmqapiproducer.amqp;

public interface PersonProducer<T> {

	void producer(T t);
}
