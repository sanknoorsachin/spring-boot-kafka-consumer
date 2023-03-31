package com.example.kafka.consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
	
	private String firstName;
	private String lastName;
	private String age;

}
