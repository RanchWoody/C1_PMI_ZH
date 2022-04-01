
public class Exam extends Grades
{
    public Exam() {
    }

    public void registGradeToSubject(String subject, int grade)
    {
        for (int i = 0; i < subjects.size(); i++)
        {
            if(subjects.get(i).equals(subject))
            {
                grades.set(i, Integer.toString(grade));
            }
        }
    }
}
