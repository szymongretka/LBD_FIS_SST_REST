package pl.fis.szymon.gretka.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Spaceship {
	
	private String name;
	private Integer range;
	
	public Spaceship() {}

	public Spaceship(String name, Integer range) {
		super();
		this.name = name;
		this.range = range;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRange() {
		return range;
	}
	public void setRange(Integer range) {
		this.range = range;
	}


	@Override
	public String toString() {
		return "Spaceship [name=" + name + ", range=" + range + "]";
	}
	
	
	
	
}
