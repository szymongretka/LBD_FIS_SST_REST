package pl.fis.szymon.gretka;

import io.swagger.jaxrs.config.BeanConfig;
import pl.fis.szymon.gretka.endpoints.SpaceshipEndpoint;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class RestConfig extends Application {
	
	
	

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(pl.fis.szymon.gretka.endpoints.SpaceshipEndpoint.class);
		classes.add(pl.fis.szymon.gretka.entities.SpaceFleet.class);
		classes.add(pl.fis.szymon.gretka.entities.Spaceship.class);
		classes.add(pl.fis.szymon.gretka.entities.DataLoader.class);
		classes.add(pl.fis.szymon.gretka.exceptions.ExceptionClass.class);
		classes.add(pl.fis.szymon.gretka.exceptions.ResourceNotFound.class);
		classes.add(pl.fis.szymon.gretka.exceptions.ResourceNotFoundHandler.class);
		classes.add(pl.fis.szymon.gretka.exceptions.BadRequestHandler.class);
		classes.add(pl.fis.szymon.gretka.RestConfig.class);
		classes.add(com.github.phillipkruger.apiee.ApieeService.class);
		return classes;
	}

   /* public RestConfig() {
        init();
    }
    
 
    private void init() {
       
          BeanConfig beanConfig = new BeanConfig();
          beanConfig.setVersion("1.0.0");
          beanConfig.setSchemes(new String[]{"http"});
          beanConfig.setHost("localhost:8080");
          beanConfig.setBasePath("/lbd-rest/api");
          beanConfig.setResourcePackage(SpaceshipEndpoint.class.getPackage().getName());
          beanConfig.setTitle("Swagger UI Example");
          beanConfig.setDescription("Swagger and Swagger UI");
          beanConfig.setScan(true);
    }*/
	
}
