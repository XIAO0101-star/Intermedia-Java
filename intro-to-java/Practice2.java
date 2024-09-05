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
                while (true){
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
                    System.out.println("The area of the rectangle is: " + r1.getArea());
                    sc.nextLine();
                    System.out.println("Do you want to modify your rectangle? (y/n) ");
                    String modifyr = sc.nextLine();
                    if(modifyr.equals("n")){
                        break;
                    }
                }
            } 
            else if (shape.equals("circle")){
                while (true){
                    circle c1 = new circle();
                    System.out.println("Please input the coordination of center point and radius of the circle.");
                    System.out.println("Now enter x-axis coordinate, hit enter key when finish input: ");
                    c1.setX(sc.nextDouble());
                    System.out.println("Now enter y-axis coordinate, hit enter when finish: ");
                    c1.setY(sc.nextDouble());
                    while (true){
                        System.out.println("Now enter the radius of the circle, hit enter when finish: ");
                        c1.setRadius(sc.nextDouble());
                        if (c1.getRadius() != 0){
                            break;
                        }
                    }

                    System.out.println("The center point coordinate of the circle is: (" + c1.getX() + "," + c1.getY() + ")");
                    System.out.println("The radius of the circle is: " + c1.getRadius());
                    System.out.println("The area of the circle is: " + c1.getArea());
                    System.out.println("Do you want to modify your circle? (y/n) ");
                    sc.nextLine();
                    String modifyc = sc.nextLine();
                    if (modifyc.equals("n")){
                        break;
                    }
                }
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
        public double getArea () {
            return this.length * this.width;
        }
}

class circle{
    private double x;
    private double y;
    private double radius;
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setX(double newX) {
        this.x = newX;
    }
    public void setY(double newY) {
        this.y = newY;
    }
    public void setRadius(double newRadius){
        if (newRadius > 0){
            this.radius = newRadius;
        } else {
            System.out.println("Invalid input. Please try again. ");
        }
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
