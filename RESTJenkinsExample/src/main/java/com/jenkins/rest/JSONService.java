package com.jenkins.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jenkins.Track;

@Path("/jenkins")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {

		System.out.println("In the getTrackInJSON()......");
		//Logging.global.log(Level.INFO,"Hello");

		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");
		
		System.out.println("End of getTrackInJSON()......");

		return track;

	}

	
}