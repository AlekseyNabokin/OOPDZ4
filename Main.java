import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();

        teacherService.add(new Teacher("Иван","Петрович", "Игорович", LocalDate.now(),80L));
        teacherService.add(new Teacher("Игорь","Петрович", "Игорович", LocalDate.now(),11L));
        teacherService.add(new Teacher("Антон","Петрович", "Игорович", LocalDate.now(),60L));
        teacherService.add(new Teacher("Санек","Петрович", "Игорович", LocalDate.now(),40L));

        teacherService.printTeachersByExperience();

    }
}