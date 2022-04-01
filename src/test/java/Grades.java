import java.util.ArrayList;

public class Grades {


    public Grades() {
    }

    ArrayList<String> subjects = new ArrayList<>();
    ArrayList<String> grades = new ArrayList<>();

    public void addSubject(String subject)
    {
        subjects.add(subject);
        grades.add("-");
    }

    public void dropSubject(String subject)
    {
        subjects.remove(subject);
        for (int i = 0; i < subjects.size(); i++)
        {
            if(subjects.get(i) == subject)
            {
                grades.remove(i);
            }
        }
    }

    public String getGrades()
    {
        String ret = "";

        for (int i = 0; i < subjects.size(); i++)
        {
            if (i == subjects.size()-1)
            {
                ret += subjects.get(i)+" "+grades.get(i);
            }

            else
            {
                ret += subjects.get(i)+" "+grades.get(i)+"\n";
            }
        }

        return ret;
    }



}
