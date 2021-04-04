package com.ggar.algorithms.core.model;

public interface ParameterContainer {

	<T> ParameterContainer setOrUpdate(String identifier, T value);
	<T> T get(String identifier);

}
