package com.Sameflix.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Sameflix.backend.Domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
