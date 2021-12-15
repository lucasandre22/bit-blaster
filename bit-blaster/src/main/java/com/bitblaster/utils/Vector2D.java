package com.bitblaster.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

////X and Y axis based values
@Getter @Setter @NoArgsConstructor
public class Vector2D<T> {
	public T first;
	public T second;
	
	public Vector2D(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public void set(T first, T second) {
		this.first = first;
		this.second = second;
	}
}
