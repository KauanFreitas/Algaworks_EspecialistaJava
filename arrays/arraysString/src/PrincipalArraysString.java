import java.util.Arrays;
import java.util.Comparator;

public class PrincipalArraysString {
    public static void main(String[] args) {
        Integer[] notas= {8,5,4,9,10};

        Arrays.sort(notas, Comparator.reverseOrder());

        System.out.println(Arrays.toString(notas)); ;


    }

}
