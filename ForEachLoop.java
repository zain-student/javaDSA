// Find the average of all the given ages
public class ForEachLoop {
    public static void main(String[] args) {
        int[] ages = { 45, 65, 34, 76, 23, 54 };
        int sum = 0;
        int total = ages.length;
        for (int age : ages) {
            sum += age;
        }
        System.out.println(sum);
        int avg = sum / total;
        System.out.println("Average of all the ages is :" + avg);
    }
}