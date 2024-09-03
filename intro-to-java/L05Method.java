public class L05Method {
    public static void main(String[] args){
        int footbar = addTwoNumber(3, 4);
        System.out.println(footbar);
    }
    public static int addTwoNumber(int x, int y){
        int sum = x + y;
        return sum;
    }
    public static double calculateGST(double amount, double gstPercentage){
        return amount*gstPercentage;
    }
    public static double calculatePerimeter(double length, double width){
        return 2 * (length + width);
    }
}
