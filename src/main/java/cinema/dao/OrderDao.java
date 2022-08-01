package cinema.dao;

import cinema.model.Order;
import cinema.model.User;
import java.util.List;

public interface OrderDao {
    public List<Order> getByUser(User user);

    public Order add(Order order);
}
