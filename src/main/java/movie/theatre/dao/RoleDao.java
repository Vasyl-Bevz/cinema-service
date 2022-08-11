package movie.theatre.dao;

import java.util.Optional;
import movie.theatre.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(Role.RoleName roleName);
}
