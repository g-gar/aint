package com.ggar.algorithms.implementations.arrayitemselection;

import com.ggar.algorithms.core.model.ParameterContainer;
import com.ggar.algorithms.core.model.VariableExecutionAlgorithm;

import java.util.*;
import java.util.function.Predicate;

public class ArrayItemSelection<E> implements VariableExecutionAlgorithm<ArrayItemSelectionParameterContainer<E>, Collection<E>> {

	public static final String ITEMS = "items";
	public static final String ITERATOR = "iterator";
	public static final String VALIDATOR = "validator";

	private ArrayItemSelectionParameterContainer<E> parameterContainer;

	public ArrayItemSelection(ArrayItemSelectionParameterContainer<E> parameterContainer) {
		this.parameterContainer = parameterContainer;
	}

	@Override
	public Collection<E> execute() {
		return execute(this.parameterContainer);
	}

	@Override
	public Collection<E> execute(ArrayItemSelectionParameterContainer<E> arg) {
		return execute(arg.get(ArrayItemSelection.ITEMS), arg.get(ArrayItemSelection.ITERATOR), arg.get(ArrayItemSelection.VALIDATOR));
	}

	private Collection<E> execute(Collection<E> items, Iterator<E> iterator, Predicate<Collection<E>> validator) {
		Stack<E> result = new Stack<>();
		E temp = null;
		Boolean finished = false;

		while (iterator.hasNext() && !finished) {
			result.push(iterator.next());
			finished = validator.test(result);
		}

		return result;
	}
}
