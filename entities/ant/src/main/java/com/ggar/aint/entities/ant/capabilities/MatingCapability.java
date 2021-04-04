package com.ggar.aint.entities.ant.capabilities;

import com.ggar.aint.entities.common.LivingBeing;
import com.ggar.aint.entities.common.capabilities.Capability;

import java.util.Collection;
import java.util.concurrent.Future;

/**
 *
 * @param <T> Type of the living being mate. Only referring to successfully reproductive mates
 * @param <O> Type of the offspring/s
 */
public interface MatingCapability<T extends LivingBeing, O extends LivingBeing> extends Capability<T, Future<Collection<O>>> {



}
