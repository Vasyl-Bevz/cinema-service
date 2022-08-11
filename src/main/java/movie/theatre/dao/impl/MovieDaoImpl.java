package movie.theatre.dao.impl;

import movie.theatre.dao.AbstractDao;
import movie.theatre.dao.MovieDao;
import movie.theatre.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
