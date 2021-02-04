package com.zlin.jsondb.domain;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Geo {
	@JsonProperty("lat")
	private String lat;
	@JsonProperty("lng")
	private String lng;

	public Geo() {
		
	}
}
