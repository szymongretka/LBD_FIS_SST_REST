package pl.fis.szymon.gretka.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;



@Startup
@Singleton
public class DataLoader {

	List<Spaceship> listOfSpaceships = new ArrayList<>();
	SpaceFleet spaceFleet = new SpaceFleet();
	
	@PostConstruct
	public void initializeSpaceships() {
		listOfSpaceships.add(new Spaceship("venga", 2000));
		listOfSpaceships.add(new Spaceship("goliath", 8000));
		
		spaceFleet.setName("FIS Space Fleet");
		spaceFleet.setList(listOfSpaceships);
	}
	
	
	public List<Spaceship> getListOfSpaceships() {
		return listOfSpaceships;
	}
	
	public SpaceFleet getSpaceFleet() {
		return spaceFleet;
	}


	public void save(Spaceship spaceship) {
		listOfSpaceships.add(spaceship);
	}
	
	public void delete(String name) {
		Iterator<Spaceship> iterator = listOfSpaceships.iterator();
	    while (iterator.hasNext()) {
	    	Spaceship spaceship = iterator.next();
	        if (spaceship.getName().equals(name)) {
	            listOfSpaceships.remove(spaceship);
	        }
	    }
	}


	public Spaceship getByName(String name) {
		Spaceship ship = spaceFleet.getList().stream()
				  .filter(sh -> name.equals(sh.getName()))
				  .findAny()
				  .orElse(null);
		
		return ship;
	}
}
