package Infy;



import java.util.ArrayList;
        import java.util.List;
        import java.util.ListIterator;

class Studentt {
    private int StudenttId;
    private String StudenttName;
    private boolean courseRegistered;

    public Studentt(int StudenttId, String StudenttName, boolean courseRegistered) {
        this.StudenttId = StudenttId;
        this.StudenttName = StudenttName;
        this.courseRegistered = courseRegistered;
    }

    public int getStudenttId() {
        return StudenttId;
    }

    public void setStudenttId(int StudenttId) {
        this.StudenttId = StudenttId;
    }

    public String getStudenttName() {
        return StudenttName;
    }

    public void setStudenttName(String StudenttName) {
        this.StudenttName = StudenttName;
    }

    public boolean isCourseRegistered() {
        return courseRegistered;
    }

    public void setCourseRegistered(boolean courseRegistered) {
        this.courseRegistered = courseRegistered;
    }

}

class ListIterationDemo {
    public static void main(String[] args) {
        List<Studentt> Studentts = new ArrayList<Studentt>();
        Studentts.add(new Studentt(1001, "Steve", true));
        Studentts.add(new Studentt(1002, "Rachel", false));
        Studentts.add(new Studentt(1003, "Monica", true));
        Studentts.add(new Studentt(1004, "David", true));

        ListIterator<Studentt> item = Studentts.listIterator();
        System.out.println("Studentt names");
        while (item.hasNext()) {
            System.out.println(item.next().getStudenttName());
        }

        System.out.println();

        System.out.println("Studentt names in reverse order");
        while (item.hasPrevious()) {
            System.out.println(item.previous().getStudenttName());
        }

    }
}
