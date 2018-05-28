package com.aplose.apiRest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aplose.smooss.model.User;

@Path("user")
public class UserREST {

	HashMap<Long, User> users = new HashMap<>();

	public UserREST() {
		User u = new User();
		u.setFirstName("YOuli");
		u.setLastName("Lefebvre");
		u.setEmail("julie.lefebvre@outlook.fr");
		u.setNickName("Youliii");
		u.setPassword("boubou");
		u.setId(1);
		users.put(u.getId(), u);

		User u2 = new User();
		u2.setFirstName("boubou");
		u2.setLastName("lefebvre");
		u2.setEmail("bubu.lefebvre@outlook.fr");
		u2.setNickName("boubou");
		u2.setPassword("boubou");
		u2.setId(2);
		users.put(u2.getId(), u2);

	}

	// http://localhost:8080/apiREST/ws/user/2 - return user
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User readUser(@PathParam("id") long id) {
		return users.get(id);
	}
	// http://localhost:8080/apiREST/ws/user - return user list
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> readUsers() {
		List<User> userList = new ArrayList<>();
		for (Entry<Long, User> entry : users.entrySet()) {
			userList.add(entry.getValue());
		}
		return userList;
	}

}
