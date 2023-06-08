package com.Sameflix.backend.Domain;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.index.Indexed;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Movie {

	@Indexed(unique = true)
	@NotNull(message = "Please provide movie title")
	String title;

	String desc;
	
	String img;
	
	String imgTitle;
	
	String imgSm;
	
	String trailer;
	
	String video;
	
	String year;
	
	int limit;
	
	String genre;
		
	Boolean isSeries = false;

	LocalDateTime timestamp = LocalDateTime.now();
}
