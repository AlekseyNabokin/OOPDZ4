import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teachers = new ArrayList<>();
    private List<Teacher> all;

    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void remove(Teacher teacher) {
        teachers.remove(teacher);
    }

    @Override
    public List<Teacher> getUsers() {
        return teachers;
    }
    public void printTeachersByExperience() {
        Collections.sort(teachers, new UserComparator());
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public List<Teacher> getAll() {
        return all;
    }

    public void setAll(List<Teacher> all) {
        this.all = all;
    }

}
