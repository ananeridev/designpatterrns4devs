package structural.adapter.hexagonalArchitecture.application;


import java.util.List;
import java.util.Map;

import structural.adapter.hexagonalArchitecture.core.model.User;
import structural.adapter.hexagonalArchitecture.core.ports.UserRepository;
import structural.adapter.hexagonalArchitecture.core.usecases.UserService;
import structural.adapter.hexagonalArchitecture.infrastructure.UserMemoryDatabaseAdapter;

public class UserRest {
	private UserService userFacade;
	
	public UserRest() {
		UserRepository userRepo = new UserMemoryDatabaseAdapter();
		userFacade = new UserService(userRepo);
	}

	public Integer post(Map<String, String> values) {
		try { 
			User user = new User(values.get("name"), values.get("email"), values.get("password"));
			userFacade.saveUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 400;
		}
		return 201;
	}
	
	public Integer get() {
		List<User> users = userFacade.getUsers();
		users.stream().forEach(System.out::println);
		return 200;
	}
}
