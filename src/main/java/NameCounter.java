class NameCounter {
    public int count(String text) {
        String[] arrText = text.split(" ");
        int countNames = 0;
        for (String el : arrText) {
            if (el.substring(0,1).equals(el.substring(0,1).toUpperCase())) {
                if (el.substring(1,2).equals(el.substring(1,2).toLowerCase())) {
                    countNames++;
                }
            }
        }
        return countNames;
    }
}

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}