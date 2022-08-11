package movie.theatre.dao;

import java.util.List;
import movie.theatre.model.Order;
import movie.theatre.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
