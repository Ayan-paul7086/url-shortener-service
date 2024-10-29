package com.ayan.urlShortener;

import com.ayan.urlShortener.model.URL;
import com.ayan.urlShortener.model.User;
import com.ayan.urlShortener.repository.UrlRepository;
import com.ayan.urlShortener.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class UrlShortenerApplication {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UrlRepository urlRepository;

	private UUID uuid = UUID.randomUUID();

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	public static void main(String[] args) {
		SpringApplication.run(UrlShortenerApplication.class, args);
		System.out.println("URL Shortener application is running without error!");
	}

	@Bean
	public User testUser() {
		User user = new User();
		user.setUserId(uuid);
		user.setName("Ayan Paul");
		user.setEmail("ayanpaul7777@gmail.com");
		user.setCreationDate(new Date());
		user.setLastLogin(new Date());
		userRepository.save(user);
		return user;
	}

	@Bean
	public URL testURL() {
		URL url = new URL();
		url.setShortUrlId("X56Tsi9");
		url.setOriginalUrl("https://docs.google.com/document/d/1aYZRNHeT_aUXpLA0pVWnL8upV9SvBMsuAE9Xk_DqKpc/edit?tab=t.0");
		url.setUserId(uuid);
		url.setCreationDate(new Date());
		urlRepository.save(url);
		return url;
	}

	@Bean
	public String testRedis() {
		redisTemplate.opsForValue().set("X56Tsi9", "true");
		redisTemplate.opsForValue().set("vyTJ785", "true");
		redisTemplate.opsForValue().set("50ID&LK", "false");
		return "X56Tsi9";
	}
}
