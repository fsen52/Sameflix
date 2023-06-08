package com.Sameflix.backend.Domain;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.index.Indexed;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class User {

	@Indexed(unique = true)
	@NotNull(message = "Please provide username")
	String username;

	@Indexed(unique = true)
	@NotNull(message = "Please provide e-mail")
	String email;

	@NotNull
	String password;

	String profilePic;

	Boolean isAdmin = false;

	LocalDateTime timestamp = LocalDateTime.now();

}
