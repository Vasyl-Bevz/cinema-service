package movie.theatre.service;

import movie.theatre.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
