package pl.fis.szymon.gretka.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ResourceNotFoundException extends WebApplicationException {
	public ResourceNotFoundException(String message) {
        super(Response.status(Response.Status.NOT_FOUND)
            .entity(message).type(MediaType.APPLICATION_JSON).build());
    }
}
