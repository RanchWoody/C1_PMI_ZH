
public class Exam extends Grades
{
    public Exam() {
    }

    public void registGradeToSubject(String subject, int grade)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getGrades() == subject)
            {
                list.add(subject, grade);
            }
        }
    }
}
