import java.util.ArrayList;

public class Matrix {

    public static int sumOfEvenNumbers(int[][] matrix)
    {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] % 2 == 0)
                {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    public static ArrayList rowsWithZero(int[][] matrix)
    {
        ArrayList<Integer> ret = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    ret.add(i);
                    break;
                }
            }
        }

        return ret;
    }
}
