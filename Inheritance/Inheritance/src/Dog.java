public class Dog extends Animal {

    private String earShape;
    private String tailShape;
   public Dog(){
        super("Mutt","big",50);
    }

    public Dog(String type,double weight){
       this(type,weight,"Perky","Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<15?"small":(weight<35?"medium":"large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf"){
            System.out.println("Ow Wooooo!");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
    }


    //These methods are private becoz we are going to call it from the move method
    //This is a reminder that not all methods need to be exposed,
    //especially if you only intend them to be called internally from the current class.
    private void bark(){
        System.out.println("Woof!");
    }
    private void run(){
        System.out.println("Dog running");
    }
    private void walk(){
        System.out.println("Dog Walking");
    }
    private   void  wagTail(){
        System.out.println("Dog wagging tail");
    }

}
