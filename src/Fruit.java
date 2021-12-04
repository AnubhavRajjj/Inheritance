public class Fruit {
    String name;
    String taste;

    public void eat(String name,String taste){
        this.name=name;
        this.taste=taste;
        System.out.println(name + taste);

    }
}
class Apple extends Fruit{

    public void eat(String name, String taste){
        super.eat(name, taste);
    }
}
class Orange extends Fruit{

    public void eat(String name, String taste) {
        super.eat(name, taste);
    }

    public static void main(String[] args) {
        Apple obj =new Apple();
        obj.eat("Apple","Sweet");
        Orange obj1 = new Orange();
        obj1.eat("Orange","Sour");
    }
}
