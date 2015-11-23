import java.util.ArrayList;
import java.util.List;

public class MusicSchoolOrganizer implements IMusicSchoolOrganizer {

    List<Student> listStudent = new ArrayList<Student>();

    public void addNewStudent(IStudent student, ISchoolClass schoolClass) {
        student.setSchoolClass(schoolClass);
        listStudent.add((Student) student);
    }

    public void deleteStudentFromClass(IStudent student, ISchoolClass schoolClass) {
        for(Student st: listStudent){
            if(st.equals(student)) {
                listStudent.remove(st);
            }
        }
    }

    public List getAllStudents() {
        return listStudent;
    }

    public List getStudentsFromClass(ISchoolClass schoolClass) {
        List studentList = new ArrayList<Student>();
        for(Student st: listStudent){
            if(st.getSchoolClass().equals(schoolClass)){
                studentList.add(st);
            }
        }
        return studentList;
    }

    public List<Student> getStudentsFromClass(SchoolClass schoolClass) {
        List<Student> studentList = new ArrayList<Student>();
        for(Student st: listStudent){
            if(st.getSchoolClass().equals(schoolClass)){
                studentList.add(st);
            }
        }
        return studentList;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
