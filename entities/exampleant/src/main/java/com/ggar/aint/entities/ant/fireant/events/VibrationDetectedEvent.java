package com.ggar.aint.entities.ant.fireant.events;

import com.ggar.aint.entities.ant.fireant.events.model.VibrationDetectedEventData;
import com.ggar.aint.entities.common.event.AbstractEvent;
import com.ggar.aint.entities.common.event.EventPriority;

import java.util.TreeMap;

public class VibrationDetectedEvent extends AbstractEvent<VibrationDetectedEventData, FireAntEventTypes> {

	private static final TreeMap<Double, EventPriority> map = new TreeMap<Double, EventPriority>(){{
		put(10.0, EventPriority.LOW);
		put(20.0, EventPriority.MEDIUM);
		put(30.0, EventPriority.HIGH);
		put(Double.MAX_VALUE, EventPriority.FATAL);
	}};

	public VibrationDetectedEvent(Double amount, Double direction) {
		super(new VibrationDetectedEventData(amount, direction), FireAntEventTypes.VIBRATIONS_DETECTED, map.ceilingEntry(amount).getValue());
	}

}
