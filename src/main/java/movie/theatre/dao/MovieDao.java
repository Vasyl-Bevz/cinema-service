package movie.theatre.dao;

import java.util.List;
import java.util.Optional;
import movie.theatre.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
