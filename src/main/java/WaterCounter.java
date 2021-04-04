class WaterCounter {
    public double count(String text) {
        char[] arrText = text.toCharArray();
        double countSymbols = text.length();
        double countSpaces = 0;

        for (char el : arrText) {
            if (el == ' ') {
                countSpaces++;
            }
        }

        return countSpaces / countSymbols;
    }
}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}