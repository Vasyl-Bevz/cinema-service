package movie.theatre.service;

import java.util.List;
import movie.theatre.model.Order;
import movie.theatre.model.ShoppingCart;
import movie.theatre.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
