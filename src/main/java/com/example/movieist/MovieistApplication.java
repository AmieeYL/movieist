package com.example.movieist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class MovieistApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MovieistApplication.class, args);
	}

	@Autowired
	private MovieService movieService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("here");
		List<Movie> movies = movieService.allMovies();
		movies.forEach(movie -> System.out.println(movie.toString()));
	}
}
