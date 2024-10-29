package com.ayan.urlShortener.model;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Data
@Table("url")
public class URL {
    @PrimaryKey
    private String shortUrlId;
    private String originalUrl;
    private UUID userId;
    private Long totalReadHit;
    private Date creationDate;
    private Date expirationDate;
}