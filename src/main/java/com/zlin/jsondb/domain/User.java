
package com.zlin.jsondb.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@JsonProperty("id")
	private Long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("username")
	private String username;
	@JsonProperty("email")
	private String email;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("website")
	private String website;
	@Embedded
	@JsonProperty("address")
	private Address address;
	@Embedded
	@JsonProperty("company")
	private Company company;
	
	public User() {
		
	}

}
