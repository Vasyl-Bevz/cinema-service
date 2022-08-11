package movie.theatre.service;

import movie.theatre.model.MovieSession;
import movie.theatre.model.ShoppingCart;
import movie.theatre.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
