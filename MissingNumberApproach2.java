import java.util.*;

public class MissingNumberApproach2 {
    static List<Integer> MissingNumbers(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int index = Math.abs(arr[i]);
      if (arr[index - 1] > 0) {
        arr[index - 1] *= -1;
      }
    }
    List < Integer > ans = new ArrayList < > ();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        ans.add(i + 1);
      }
    }
    return ans; 
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> res = MissingNumbers(arr);
        System.out.println(res);
        sc.close();
  }
}