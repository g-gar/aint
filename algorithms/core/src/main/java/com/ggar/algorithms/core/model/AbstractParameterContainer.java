package com.ggar.algorithms.core.model;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractParameterContainer implements ParameterContainer {
	
	protected final Map<String, Object> parameters;

	public AbstractParameterContainer() {
		this(new HashMap<>());
	}

	public AbstractParameterContainer(Map<String, Object> parameters) {
		this.parameters = parameters;
	}
	
	@Override
	public <T> ParameterContainer setOrUpdate(String identifier, T value) {
		parameters.put(identifier, value);
		return this;
	}

	@Override
	public <T> T get(String identifier) {
		return (T) parameters.get(identifier);
	}
}
