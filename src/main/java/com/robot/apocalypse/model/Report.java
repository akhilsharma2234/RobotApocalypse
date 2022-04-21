package com.robot.apocalypse.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({ "infectedSurvivorsPercentage", "nonInfectedSurvivorsPercentage", "infectedSurvivors",
		"nonInfectedSurvivors", "robots" })
public class Report {

	private String infectedSurvivorsPercentage;
	private String nonInfectedSurvivorsPercentage;
	private List<SurvivorDTO> infectedSurvivors;
	private List<SurvivorDTO> nonInfectedSurvivors;
	private List<Robot> robots;

	public String getInfectedSurvivorsPercentage() {
		return infectedSurvivorsPercentage;
	}

	public void setInfectedSurvivorsPercentage(String infectedSurvivorsPercentage) {
		this.infectedSurvivorsPercentage = infectedSurvivorsPercentage;
	}

	public String getNonInfectedSurvivorsPercentage() {
		return nonInfectedSurvivorsPercentage;
	}

	public void setNonInfectedSurvivorsPercentage(String nonInfectedSurvivorsPercentage) {
		this.nonInfectedSurvivorsPercentage = nonInfectedSurvivorsPercentage;
	}

	public List<SurvivorDTO> getInfectedSurvivors() {
		return infectedSurvivors;
	}

	public void setInfectedSurvivors(List<SurvivorDTO> infectedSurvivors) {
		this.infectedSurvivors = infectedSurvivors;
	}

	public List<SurvivorDTO> getNonInfectedSurvivors() {
		return nonInfectedSurvivors;
	}

	public void setNonInfectedSurvivors(List<SurvivorDTO> nonInfectedSurvivors) {
		this.nonInfectedSurvivors = nonInfectedSurvivors;
	}

	public List<Robot> getRobots() {
		return robots;
	}

	public void setRobots(List<Robot> robots) {
		this.robots = robots;
	}

	public Report() {
		super();
	}

	public Report(String infectedSurvivorsPercentage, String nonInfectedSurvivorsPercentage,
			List<SurvivorDTO> infectedSurvivors, List<SurvivorDTO> nonInfectedSurvivors, List<Robot> robots) {
		super();
		this.infectedSurvivorsPercentage = infectedSurvivorsPercentage;
		this.nonInfectedSurvivorsPercentage = nonInfectedSurvivorsPercentage;
		this.infectedSurvivors = infectedSurvivors;
		this.nonInfectedSurvivors = nonInfectedSurvivors;
		this.robots = robots;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((infectedSurvivors == null) ? 0 : infectedSurvivors.hashCode());
		result = prime * result + ((infectedSurvivorsPercentage == null) ? 0 : infectedSurvivorsPercentage.hashCode());
		result = prime * result + ((nonInfectedSurvivors == null) ? 0 : nonInfectedSurvivors.hashCode());
		result = prime * result
				+ ((nonInfectedSurvivorsPercentage == null) ? 0 : nonInfectedSurvivorsPercentage.hashCode());
		result = prime * result + ((robots == null) ? 0 : robots.hashCode());
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
		Report other = (Report) obj;
		if (infectedSurvivors == null) {
			if (other.infectedSurvivors != null)
				return false;
		} else if (!infectedSurvivors.equals(other.infectedSurvivors))
			return false;
		if (infectedSurvivorsPercentage == null) {
			if (other.infectedSurvivorsPercentage != null)
				return false;
		} else if (!infectedSurvivorsPercentage.equals(other.infectedSurvivorsPercentage))
			return false;
		if (nonInfectedSurvivors == null) {
			if (other.nonInfectedSurvivors != null)
				return false;
		} else if (!nonInfectedSurvivors.equals(other.nonInfectedSurvivors))
			return false;
		if (nonInfectedSurvivorsPercentage == null) {
			if (other.nonInfectedSurvivorsPercentage != null)
				return false;
		} else if (!nonInfectedSurvivorsPercentage.equals(other.nonInfectedSurvivorsPercentage))
			return false;
		if (robots == null) {
			if (other.robots != null)
				return false;
		} else if (!robots.equals(other.robots))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Report [infectedSurvivorsPercentage=" + infectedSurvivorsPercentage
				+ ", nonInfectedSurvivorsPercentage=" + nonInfectedSurvivorsPercentage + ", infectedSurvivors="
				+ infectedSurvivors + ", nonInfectedSurvivors=" + nonInfectedSurvivors + ", robots=" + robots + "]";
	}

}
