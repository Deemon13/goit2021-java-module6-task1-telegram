class BigOrSmall {
    public String calculate(String text) {
        String[] arrText = text.replace(" ", "").split("");
        int countBig = 0;
        int countSmall = 0;
        String resultText = "";

        for (String el : arrText) {
            if (el.equals(el.toUpperCase())) {
                countBig++;
            } else {
                countSmall++;
            }
         }

        if (countBig > countSmall) {
            resultText = "Big";
        } else if (countSmall > countBig) {
            resultText = "Small";
        } else {
            resultText = "Same";
        }

        return resultText;
    }
}

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}