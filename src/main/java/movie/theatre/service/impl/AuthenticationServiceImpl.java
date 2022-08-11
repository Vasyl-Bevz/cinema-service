package movie.theatre.service.impl;

import java.util.HashSet;
import java.util.Set;
import movie.theatre.model.Role;
import movie.theatre.model.User;
import movie.theatre.service.AuthenticationService;
import movie.theatre.service.RoleService;
import movie.theatre.service.ShoppingCartService;
import movie.theatre.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        Set<Role> roles = new HashSet<>();
        roles.add(roleService.getByName(Role.RoleName.USER.name()));
        user.setRoles(roles);
        user.setEmail(email);
        user.setPassword(password);
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
