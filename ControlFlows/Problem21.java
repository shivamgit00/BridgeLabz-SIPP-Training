import java.util.Scanner;
import java.util.*;
  
public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));

    }
}
