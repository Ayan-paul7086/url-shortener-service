package com.ayan.urlShortener.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Data
@Table("user")
public class User {
    @PrimaryKey
    private UUID userId;
    private String name;
    private String email;
    private Date creationDate;
    private Date lastLogin;
}