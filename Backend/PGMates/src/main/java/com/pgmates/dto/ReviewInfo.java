package com.pgmates.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ReviewInfo {
	private int userId;
	private int propertyId;
	private String comment;
	private int ratings;
}
