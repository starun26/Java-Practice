public class Annotations {
    public static void main(String[] args) {
        Square s = new Square();
        s.printNameOfClass();
    }

}

class Rectangle{
    public void printNameOfClass() {
        System.out.println("Rectangle");
    }
}

class Square extends Rectangle {
    @Override
    public void printNameOfClass() {
        System.out.println("Square");
    }
}
