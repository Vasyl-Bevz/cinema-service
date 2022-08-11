package movie.theatre.service.impl;

import java.util.NoSuchElementException;
import movie.theatre.dao.RoleDao;
import movie.theatre.model.Role;
import movie.theatre.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(Role.RoleName.valueOf(roleName))
                .orElseThrow(() -> new NoSuchElementException("Cant find role " + roleName));
    }
}
