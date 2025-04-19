import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] scores = {55, 56, 70, 80, 90, 77, 56, 90, 76, 77};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int average = sum / scores.length;
        int high = scores[0];
        int low = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > high) {
                high = scores[i];
            }
            if (scores[i]<low) {
                low = scores[i];
            }
        }
        Arrays.sort(scores);
        double median;
        if (scores.length%2==0){
            median=(scores[scores.length/2-1]+scores[scores.length/2])/2.0;
        }
        else {
            median=scores[scores.length/2];

        }
        double deff=Math.abs(average-median);
        System.out.println("Average: "+average);
        System.out.println("Low score: "+low);
        System.out.println("High score: "+high);
        System.out.println("median "+median);
        System.out.println("difference between "+deff);

    }

}