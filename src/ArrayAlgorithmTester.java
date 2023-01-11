import java.util.Arrays;

public class ArrayAlgorithmTester
{
    public static void main(String[] args)
    {
        String[] strings = {"hello!", "!!!whoa", "sad", "Adam!", "What! No way", "Why?!"};
        int numExclamations = ArrayAlgorithms.endsInExclamations(strings);
        System.out.println(numExclamations);

        // original array NOT modified
        System.out.println(Arrays.toString(strings));
    }

}
