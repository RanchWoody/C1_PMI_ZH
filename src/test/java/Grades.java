import java.util.ArrayList;

public class Grades {

    private String subject;
    private int grade;

    public Grades(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;;
    }

    public Grades() {
    }

    ArrayList<Grades> list = new ArrayList<>();

    public void addSubject(String subject)
    {
        list.add(subject, grade);
    }

    public void dropSubject(String subject)
    {
        list.remove(subject);
    }

    public String getGrades()
    {
        String ret = "";

        for (int i = 0; i < list.size(); i++)
        {
                ret += list.get(i)+"\n";
        }

        return ret;
    }



}
