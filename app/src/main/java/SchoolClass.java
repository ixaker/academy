
public class SchoolClass implements ISchoolClass{
    private String nameClass;

    SchoolClass(String nameClass){
        this.nameClass = nameClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolClass that = (SchoolClass) o;
        return !(nameClass != null ? !nameClass.equals(that.nameClass) : that.nameClass != null);
    }

    @Override
    public int hashCode() {
        int result = nameClass != null ? nameClass.hashCode() : 0;
        result = 31 * result;
        return result;
    }
}
