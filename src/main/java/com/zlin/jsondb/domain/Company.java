package com.zlin.jsondb.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Company {
	@Column(name = "company_name")
	@JsonProperty("name")
	private String name;
	@JsonProperty("catchPhrase")
	private String catchPhrase;
	@JsonProperty("bs")
	private String bs;
	
	public Company() {
		
	}

}
