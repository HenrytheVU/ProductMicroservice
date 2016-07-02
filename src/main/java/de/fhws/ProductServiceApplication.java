package de.fhws;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import de.fhws.spring.model.Product;
import de.fhws.spring.repository.ProductRepository;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {
	SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ProductRepository productRepository) {
	return (evt) -> {
	    final List<Product> products = Arrays.asList(new Product(1, "Baby Shampoo", 12.4), //
		    new Product(2, "LEGO Star Wars", 430.10), //
		    new Product(3, "Samsung 4K Monitor", 899.95), //
		    new Product(4, "NVDIA Geforce 1080", 749.50), //
		    new Product(5, "IPhone 7 128 GB", 999.03), //
		    new Product(6, "MacBook Pro MID2016", 2000.10));
	    productRepository.save(products);

	};
    }
}
