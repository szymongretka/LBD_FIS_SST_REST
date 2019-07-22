package pl.fis.szymon.gretka.endpoints;

import java.util.*;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pl.fis.szymon.gretka.entities.Spaceship;
import pl.fis.szymon.gretka.exceptions.ResourceNotFoundException;
import pl.fis.szymon.gretka.entities.DataLoader;
import pl.fis.szymon.gretka.entities.SpaceFleet;

@Path("/")
public class SpaceshipEndpoint {
	
	@Inject
	private DataLoader Dt;
	
	
	@GET
	@Path("v1/spaceships")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Spaceship> getAllSpaceships(){
		List<Spaceship> ships = Dt.getListOfSpaceships();
		return ships;
	}
	
	 @POST
	 @Path("v1/spaceships")
	 @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	 public void createSpaceship(Spaceship spaceship) {
	     Dt.save(spaceship);
	 }
	
	@DELETE
	@Path("v1/spaceships/{name}")
	public void deleteSpaceShipByName(@PathParam(value = "name") String name) {
		Dt.delete(name);
	}
	
	@GET
	@Path("v3/space-fleet")
	@Produces(MediaType.APPLICATION_JSON)
	public SpaceFleet getSpaceFleet(SpaceFleet fleet){
		fleet = Dt.getSpaceFleet();
		return fleet;
	}
	
	@POST
	@Path("v3/space-fleet")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createSpaceshipInSpaceFleet(Spaceship spaceship) {
	    Dt.save(spaceship);
	}
	
	 
	@GET
	@Path("v3/ships/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Spaceship getSpaceshipByName(@PathParam(value = "name") String name){
		return Dt.getByName(name);
	}
	
	
	@GET
	@Path("v4/space-fleet/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Spaceship getSpaceshipByNameV4(@PathParam(value = "name") String name) throws ResourceNotFoundException{
		return Dt.getByName(name);
	}
	
	
}
