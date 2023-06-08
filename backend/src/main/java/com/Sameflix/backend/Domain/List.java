package com.Sameflix.backend.Domain;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.data.mongodb.core.index.Indexed;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class List {

	@Indexed(unique = true)
	@NotNull(message = "Please provide movie title")
	String title;

	String type;

	String genre;

	ArrayList<String> content;

	LocalDateTime timestamp = LocalDateTime.now();

}
