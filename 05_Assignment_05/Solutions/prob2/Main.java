public class Main {
    public static void main(String[] args) {
       Duck[] DuckList ={new DecoyDuck(),new MallardDuck(),new RedheadDuck(),new RubberDuck()};

       for(Duck d : DuckList){
           System.out.println(d.getClass().getSimpleName());
           d.display();
           d.fly();
           d.quack();
           d.swim();
       }

    }
}