package com.ggar.aint.entity;

import java.util.Collection;
import java.util.concurrent.Future;

/**
 *
 * @param <T> Type of the living being mate. Only referring to successfully reproductive mates
 * @param <O> Type of the offspring/s
 */
public interface Reproductible<T extends LivingBeing, O extends LivingBeing>{

	Future<Collection<O>> reproduce(T mate);

}
