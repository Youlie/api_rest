package com.aplose.apiRest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@ApplicationPath("ws")
public class ApliConfigREST extends Application{
	
	@Override
	public Set<Class<?>> getClasses(){
		HashSet<Class<?>> classesWS = new HashSet<>();
		classesWS.add(UserREST.class);
		
		return classesWS;
		
	}

}
