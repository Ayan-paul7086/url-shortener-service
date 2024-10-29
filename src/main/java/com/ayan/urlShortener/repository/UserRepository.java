package com.ayan.urlShortener.repository;

import com.ayan.urlShortener.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User, Long> {
}
