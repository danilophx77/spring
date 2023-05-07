package com.example.obrestdatajpa;

import com.example.obrestdatajpa.entities.Laptop;
import com.example.obrestdatajpa.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		// CRUD
		// crear laptop
		Laptop laptop1 = new Laptop(null, "axdr", "Acer", 8, 29.99, LocalDate.of(2018, 12, 1), true);
		Laptop laptop2 = new Laptop(null, "s22113", "Samsung", 4, 19.99, LocalDate.of(2013, 12, 1), true);
		// almacenar una laptop
		System.out.println("Num laptops en base de datos: " + repository.findAll().size());

		repository.save(laptop1);
		repository.save(laptop2);

		// recuperar todos los libros
		System.out.println("Num laptops en base de datos: " + repository.findAll().size());

		// borrar un libro
		// repository.deleteById(1L);

		System.out.println("Num laptops en base de datos: " + repository.findAll().size());
	}

}
