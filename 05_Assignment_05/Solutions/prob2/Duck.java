public  class Duck   {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(FlyBehavior fb,QuackBehavior qb) {
        this.flyBehavior=fb;
        this.quackBehavior=qb;
    }
    public  void display(){
        System.out.println("Duck");
    }
    public  void swim(){
        System.out.println("swimming");
    }

    public void fly() {
        flyBehavior.fly();;
    }


    public void quack() {
        quackBehavior.quack();
    }
}
