package movie.theatre.service;

import movie.theatre.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
