package movie.theatre.dao.impl;

import java.util.Optional;
import movie.theatre.dao.AbstractDao;
import movie.theatre.dao.RoleDao;
import movie.theatre.exception.DataProcessingException;
import movie.theatre.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(Role.RoleName roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> findByName = session.createQuery(
                    "FROM Role WHERE roleName = :roleName", Role.class);
            findByName.setParameter("roleName", roleName);
            return findByName.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Cant find role name " + roleName, e);
        }
    }
}
