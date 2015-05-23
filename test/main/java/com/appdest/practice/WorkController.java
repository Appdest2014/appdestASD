package com.appdest.practice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;

import com.appdest.practice.service.PersonDao;

@Controller
@Path("/details")
public class WorkController {
	@GET
	@Path("/info")
	@Produces(MediaType.APPLICATION_JSON)
	public PersonDao getPersonMsg() {
		/*
		 * System.out.println(id); System.out.println(name);
		 */
		PersonDao pDao = new PersonDao();

		pDao.setName("SWETHA");
		pDao.setId(21);
		pDao.setQualification("B.Tech");
		pDao.setCity("Hyderabad");

		System.out.println("test service");

		return pDao;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createProductInJSON(PersonDao person) {

		String result = "PERSON : " + person;
		return Response.status(400).entity(result).build();

	}
}
