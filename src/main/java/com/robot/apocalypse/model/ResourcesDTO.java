package com.robot.apocalypse.model;

public class ResourcesDTO {

	private Integer water;
	private Integer ammunition;
	private Integer medication;
	private Integer food;

	public Integer getWater() {
		return water;
	}

	public void setWater(Integer water) {
		this.water = water;
	}

	public Integer getAmmunition() {
		return ammunition;
	}

	public void setAmmunition(Integer ammunition) {
		this.ammunition = ammunition;
	}

	public Integer getMedication() {
		return medication;
	}

	public void setMedication(Integer medication) {
		this.medication = medication;
	}

	public Integer getFood() {
		return food;
	}

	public void setFood(Integer food) {
		this.food = food;
	}

	public ResourcesDTO() {
		super();
	}

	public ResourcesDTO(Integer water, Integer ammunition, Integer medication, Integer food) {
		super();
		this.water = water;
		this.ammunition = ammunition;
		this.medication = medication;
		this.food = food;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ammunition == null) ? 0 : ammunition.hashCode());
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((medication == null) ? 0 : medication.hashCode());
		result = prime * result + ((water == null) ? 0 : water.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResourcesDTO other = (ResourcesDTO) obj;
		if (ammunition == null) {
			if (other.ammunition != null)
				return false;
		} else if (!ammunition.equals(other.ammunition))
			return false;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (medication == null) {
			if (other.medication != null)
				return false;
		} else if (!medication.equals(other.medication))
			return false;
		if (water == null) {
			if (other.water != null)
				return false;
		} else if (!water.equals(other.water))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ResourcesDTO [water=" + water + ", ammunition=" + ammunition + ", medication=" + medication + ", food="
				+ food + "]";
	}

}
