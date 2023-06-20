package com.Sameflix.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

import com.Sameflix.backend.domain.User;
import com.Sameflix.backend.domain.dto.LoginDTO;
import com.Sameflix.backend.repository.UserRepository;

@Transactional
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	//REGISTER
	
	public User register(User user) throws BadRequest {
		
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		
		user.setPassword(encodedPassword);
		
	return userRepository.save(user);
		
		
	}

	//LOGIN
	
	public String login(LoginDTO loginDTO) {
		Optional<User> returnedUser = userRepository.findByEmail(loginDTO.getEmail());
		String data = returnedUser.get().getUsername();
		if(data==null) {
			return "User not found";
		}
		return data;
	}

}
