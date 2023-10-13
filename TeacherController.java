import java.time.LocalDate;
public class TeacherController implements UserController<Teacher>{

    private final TeacherService dataService = new TeacherService();

    private final TeacherView teacherViewView = new TeacherView();
    private TeacherView teacherView;
    private TeacherController TeacherdataService;

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        TeacherdataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void setTeacherView(TeacherView teacherView) {
        this.teacherView = teacherView;
    }

    public void setTeacherdataService(TeacherController teacherdataService) {
        TeacherdataService = teacherdataService;
    }
}