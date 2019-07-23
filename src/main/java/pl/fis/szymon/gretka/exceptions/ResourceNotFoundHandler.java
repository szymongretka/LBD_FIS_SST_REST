package pl.fis.szymon.gretka.exceptions;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider //JAX-RS will register this mapper to intercept the response when particular exception was thrown
public class ResourceNotFoundHandler implements ExceptionMapper<ResourceNotFound> {

	@Override
	public Response toResponse(ResourceNotFound exception) {
		return Response.status(Status.NOT_FOUND)
				.entity(new ExceptionClass(Response.Status.NOT_FOUND, exception.getMessage()))
				.type(MediaType.APPLICATION_JSON).build(); 
	}
}
