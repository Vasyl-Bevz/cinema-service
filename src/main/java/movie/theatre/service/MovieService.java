package movie.theatre.service;

import java.util.List;
import movie.theatre.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
