import java.util.*;
public class Practice2 {
    public static void main(String[] args){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the shape you want to draw (e.g., rectangle, circle, etc). Enter stop to quit: ");
            String shape = sc.nextLine();
            if ( shape.equals("stop") ){
                break;
            }
            else if ( shape.equals("rectangle") ){
                rectangle r1 = new rectangle();
                System.out.println("Please enter the top-left coordinate, length and width of the rectangle: ");
                System.out.println("Now enter x-axis coordinate, hit enter key when finish input: ");
                r1.setX(sc.nextDouble());
                System.out.println("Now enter y-axis coordinate, hit enter when finish: ");
                r1.setY(sc.nextDouble());
                while (true){
                    System.out.println("Now enter length of the rectangle, hit enter when finish: ");
                    r1.setLength(sc.nextDouble());
                    if (r1.getLength() != 0){
                        break;
                    }
                }
                while (true){
                    System.out.println("Now enter the width of the rectangle, hit enter when finish: ");
                    r1.setWidth(sc.nextDouble());
                    if (r1.getWidth() != 0){
                        break;
                    }
                }
                System.out.println("The top-left coordinate of the rectangle is: (" + r1.getX() + "," + r1.getY() + ")");
                System.out.println("The top-right coordinate of the rectangle is: (" + (r1.getX()+r1.getLength()) + "," + r1.getY() + ")");
                System.out.println("The bottom-left coordinate of the rectangle is: (" + r1.getX() + "," + (r1.getY()-r1.getWidth()) + ")");
                System.out.println("The bottom-right coordinate of the rectangle is: (" + (r1.getX()+r1.getLength()) + "," + (r1.getY()-r1.getWidth()) + ")");
            } else {
                System.out.println("Drawing of this shape is still under development. Please wait for further updates.");
            }
        }
    }
}

class rectangle{
        private double x;
        private double y;
        private double length;
        private double width;
        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }
        public double getLength(){
            return this.length;
        }
        public double getWidth(){
            return this.width;
        }
        public void setX(double newX) {
            this.x = newX;
        }
        public void setY(double newY) {
            this.y = newY;
        }
        public void setLength(double newLength){
            if (newLength > 0){
                this.length = newLength;
            } else {
                System.out.println("Invalid input. Please try again. ");
            }
        }
        public void setWidth(double newWidth){
            if (newWidth > 0){
                this.width = newWidth;
            } else {
                System.out.println("Invalid input. Please try again. ");
            }
        }
}
