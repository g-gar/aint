package com.ggar.algorithms.core.model;

public interface VariableExecutionAlgorithm<T extends ParameterContainer, R> extends Algorithm<R> {

	R execute(T arg);

}
