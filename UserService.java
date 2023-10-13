import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {
    void add(T user);
    void remove(T user);
    List<T> getUsers();
}