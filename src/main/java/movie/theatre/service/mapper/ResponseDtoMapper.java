package movie.theatre.service.mapper;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T t);
}
