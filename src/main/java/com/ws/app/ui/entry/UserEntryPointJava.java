package com.ws.app.ui.entry;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserEntryPointJava {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CreateUserResponseModel createUser(CreateUserRequestModel requestObject) {
        CreateUserResponseModel returnValue = new CreateUserResponseModel();
        return  returnValue;

    }
}
