package com.ggar.aint.entities.ant.fireant.system;

import com.ggar.aint.entities.ant.Ant;
import com.ggar.aint.entities.ant.fireant.FireAnt;
import com.ggar.aint.entities.ant.systems.AbstractNervousSystem;
import com.ggar.aint.entities.common.chemical.Chemical;
import com.ggar.aint.entities.common.types.ChemicalType;

import java.util.Collection;

public class FireAntNervousSystem extends AbstractNervousSystem<FireAnt> {

	protected FireAntNervousSystem(FireAnt entity) {
		super(entity);
	}

	@Override
	public Boolean detectsVibration() {
		return null;
	}

	@Override
	public Double getVibrationsAmount() {
		return null;
	}

	@Override
	public Double getVibrationDirection() {
		return null;
	}

	@Override
	public Boolean detectsAirCurrents() {
		return null;
	}

	@Override
	public Double getAirCurrentAmount() {
		return null;
	}

	@Override
	public Double getAirCurrentDirection() {
		return null;
	}

	@Override
	public Boolean detectsLight() {
		return null;
	}

	@Override
	public Double getLightAmount() {
		return null;
	}

	@Override
	public Boolean detectsTemperatureDrop() {
		return null;
	}

	@Override
	public Double getBodyTemperature() {
		return null;
	}

	@Override
	public Boolean detectsChemicals() {
		return null;
	}

	@Override
	public Collection<Chemical> getDetectedChemicals() {
		return null;
	}

	@Override
	public Chemical createChemical(ChemicalType chemicaltype) {
		return null;
	}

	@Override
	public Boolean isFamiliar(Ant ant) {
		return null;
	}

	@Override
	public Boolean isFromColony(Ant ant) {
		return null;
	}


}
