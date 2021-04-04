package com.ggar.aint.entities.ant.fireant.events.model;

import com.ggar.aint.entities.common.event.EventData;

public class VibrationDetectedEventData implements EventData {

	private final Double amount;
	private final Double direction;

	public VibrationDetectedEventData(Double amount, Double direction) {
		this.amount = amount;
		this.direction = direction;
	}

	public Double getAmount() {
		return amount;
	}

	public Double getDirection() {
		return direction;
	}
}
