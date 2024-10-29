package com.ayan.urlShortener.repository;

import com.ayan.urlShortener.model.URL;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UrlRepository extends CassandraRepository<URL, String> {
}
