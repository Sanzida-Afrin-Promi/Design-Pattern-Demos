package BurgerBuilder;

public class Burger {
    private final String size;
    private final int pattyCount;
    private final boolean cheeseCount;
    private final int lettuceCount;
    private final int tomatoCount;

    private Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.pattyCount = builder.pattyCount;
        this.cheeseCount = builder.cheeseCount;
        this.lettuceCount = builder.lettuceCount;
        this.tomatoCount = builder.tomatoCount;
    }

    public String getSize() {
        return size;
    }

    public int getPattyCount() {
        return pattyCount;
    }

    public boolean getCheeseCount() {
        return cheeseCount;
    }

    public int getLettuceCount() {
        return lettuceCount;
    }

    public int getTomatoCount() {
        return tomatoCount;
    }

    public static class BurgerBuilder {
        private String size;
        private int pattyCount;
        private boolean cheeseCount;
        private int lettuceCount;
        private int tomatoCount;

        public BurgerBuilder(String size) {
            this.size = size;
        }

        public BurgerBuilder addPatty(int pattyCount) {
            this.pattyCount=pattyCount;
            return this;
        }

        public BurgerBuilder addCheese() {
            this.cheeseCount=true;
            return this;
        }

        public BurgerBuilder addLettuce(int lettuceCount) {
            this.lettuceCount=lettuceCount;
            return this;
        }

        public BurgerBuilder addTomato(int tomatoCount) {
            this.tomatoCount=tomatoCount;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}