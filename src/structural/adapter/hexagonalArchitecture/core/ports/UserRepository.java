package structural.adapter.hexagonalArchitecture.core.ports;


import java.util.List;

import structural.adapter.hexagonalArchitecture.core.model.User;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
