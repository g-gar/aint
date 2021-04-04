package com.ggar.algorithms.implementations.arrayitemselection;

import com.ggar.algorithms.core.model.AbstractParameterContainer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Predicate;

public class ArrayItemSelectionParameterContainer<E> extends AbstractParameterContainer {

	public ArrayItemSelectionParameterContainer(Collection<E> items, Iterator<E> iterator, Predicate<Collection<E>>validator) {
		super(new HashMap<String, Object>(){{
			put(ArrayItemSelection.ITEMS, items);
			put(ArrayItemSelection.ITERATOR, iterator);
			put(ArrayItemSelection.VALIDATOR, validator);
		}});
	}

	public ArrayItemSelectionParameterContainer<E> addItem(E item) {
		Collection<E> items = (Collection<E>) parameters.get(ArrayItemSelection.ITEMS);
		items.add(item);
		return this;
	}
}
