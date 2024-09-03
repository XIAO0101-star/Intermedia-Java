import java.util.ArrayList;

public class L03GenericCollection {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(42);
        numbers.add(33);
        numbers.add(55);
        System.out.println(numbers.get(2));
        Map<String, Integer> months = new HashMap<String, Integer>();
        months.put("Jan", 31);
        months.put("Feb", 28);
        months.put("Mar", 30);

        System.out.println(months.get("Jan"));
        System.out.println("There are " + months.get("Feb") + "days in February");

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        ArrayList<Double> ratios = new ArrayList<Double>();
        ArrayList<Boolean> switches = new ArrayList<Boolean>();
    }
}
