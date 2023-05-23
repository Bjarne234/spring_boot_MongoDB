package bj.spring.com.example.accessingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main Klasse als Startpunkt, mit SpringApplication.run wird spring klasse gestartet

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();

		// save a couple of customers
		repository.save(Customer.builder().firstName("Alice1").lastName("Smith1").build());
		repository.save(Customer.builder().firstName("Bob1").lastName("Smith1").build());

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice1'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice1"));

		System.out.println("Customers found with findByLastName('Smith1'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith1")) {
			System.out.println(customer);
		}

	}

}