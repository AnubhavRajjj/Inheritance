public class Shape {

    public void draw(){
        System.out.println("Drawing shape");
    }
    public void erase(){
        System.out.println("Erasing shape");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Draw circle");
    }
    public void erase(){
        System.out.println("Erase circle");
    }

}
class Triangle extends Shape{
    public void draw(){
        System.out.println("Draw triangle");
    }
    public void erase(){
        System.out.println("Erase triangle");
    }

}
class Square extends Shape{
    public void draw(){
        System.out.println("Draw square");
    }
    public void erase(){
        System.out.println("Erase square");
    }

}
class print{
    public static void main(String[] args) {
        Shape a=new Shape();
        a.draw();
        a.erase();
        Shape obj= new Circle();
        obj.draw();
        obj.erase();
        Shape obj1 = new Triangle();
        obj1.draw();
        obj1.erase();
        Shape obj2 = new Square();
        obj2.draw();
        obj2.erase();
    }
}
