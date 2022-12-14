package movie.theatre.dao;

import movie.theatre.model.ShoppingCart;
import movie.theatre.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
