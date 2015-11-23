
public class Student implements IStudent {
    private String fio;
    private int age;
    private ISchoolClass schoolClass;

    Student(SchoolClass schoolClass, String fio, int age){
        this.fio = fio;
        this.age = age;
        this.schoolClass = schoolClass;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchoolClass(ISchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public ISchoolClass getSchoolClass() {
        return schoolClass;
    }

    @Override
    public boolean equals(Object other){
        if(other == null) return false;
        if(other == this) return true;
        if(getClass() != other.getClass()) return false;
        Student student = (Student) other;
        return fio == student.fio && age == student.age;
    }

    @Override
    public int hashCode() {
        int result = fio != null ? fio.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
