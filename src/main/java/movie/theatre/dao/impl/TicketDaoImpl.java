package movie.theatre.dao.impl;

import movie.theatre.dao.AbstractDao;
import movie.theatre.dao.TicketDao;
import movie.theatre.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
