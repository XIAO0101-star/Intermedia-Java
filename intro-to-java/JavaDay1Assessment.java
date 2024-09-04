// Group member: Sabrina, Kevin and Yuxuan

import java.util.*;   

public class JavaDay1Assessment {
    public static void main(String[] args) {
        int stop = 1;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers (integers or decimal). Enter 0 to stop: ");
        ArrayList<Double> numbers = new ArrayList<Double>();
        while (stop == 1 ){
            double number = sc.nextDouble();
            if ( number != 0){
                numbers.add(number);
                n++;
            } else{
                stop = 0;
            }
        }
        System.out.println("You have inputted " + n + " number(s) already.");
        double mean = calculateMean(numbers, n);
        double median = getMedian(numbers, n);
        double mode = getMode(numbers, n);
        System.out.println("The mean of the numbers is " + mean);
        System.out.println("The median of the numbers is " + median);
        System.out.println("The mode of the numbers is " + mode);
    }

    public static double calculateMean(ArrayList<Double> numbers, int n){
        double sum = 0;
        for (int i = 0; i < n; i++){
            double a = numbers.get(i);
            sum += a;
        }
        return sum/n;
    }

    public static double getMedian(ArrayList<Double> numbers, int n){
        ArrayList<Double> sortedNumbers = numbers;
        double median = 0;
        Collections.sort(sortedNumbers);
        if ( n % 2 == 0 ){
            median = ( sortedNumbers.get(n/2) + sortedNumbers.get(n/2 + 1) )/2;
        } else{
            median = sortedNumbers.get((n+1)/2);
        }
        return median;
    }

    public static double getMode(ArrayList<Double> numbers, int n){
        double mode = numbers.get(0);
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            double value = numbers.get(i);
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (numbers.get(j) == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                    }
                }
        }
        if (maxCount > 1) {
            return mode;
        }
        return 0;
    }
}
