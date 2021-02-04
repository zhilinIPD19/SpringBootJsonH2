package com.zlin.jsondb.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Address {
	@JsonProperty("street")
	private String street;
	@JsonProperty("suite")
	private String suite;
	@JsonProperty("city")
	private String city;
	@JsonProperty("zipcode")
	private String zipcode;
	
	@Embedded
	@JsonProperty("geo")
	private Geo geo;
	
	public Address() {
		
	}
}
