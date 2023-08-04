package BurgerBuilder;

public class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder("Large")
                .addPatty(2)
                .addCheese()
                .addTomato(3)
                .addLettuce(2)
                .build();

        displayBurgerStatus(burger);
    }

    public static void displayBurgerStatus(Burger burger) {
        System.out.println("Burger Status:");
        System.out.println("Size: " + burger.getSize());
        System.out.println("Patty Count: " + burger.getPattyCount());
        System.out.println("Cheese Count: " + burger.getCheeseCount());
        System.out.println("Lettuce Count: " + burger.getLettuceCount());
        System.out.println("Tomato Count: " + burger.getTomatoCount());
    }
}