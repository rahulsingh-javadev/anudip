public class abstractionHW {
    public static void main(String[] args) {
        foodOrder n = new pizza();
        ((restaurant)n).resturentName();
        n.orderPlacesd();
        n.preperedFood();
        


        foodOrder f = new burger();
        ((restaurant)f).resturentName();
        f.orderPlacesd();
        f.preperedFood();

    }
}
abstract class foodOrder{
    abstract void preperedFood();
    void orderPlacesd(){
        System.out.println("Order Has Been Plsced");
    }
}
abstract class restaurant extends foodOrder{
    abstract void resturentName();
}
class pizza extends restaurant{
    void resturentName(){
        System.out.println("ABCD");
    }
    void preperedFood(){
        System.out.println("Prepering Pizza");
    }
}
class burger extends restaurant{
    void resturentName(){
        System.out.println("DEFG");
    }
    void preperedFood(){
        System.out.println("Prepering Burger");
    }
}