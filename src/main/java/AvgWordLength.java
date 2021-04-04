class AvgWordLength {
    public double count(String phrase) {
        String[] arrPhrase = phrase.split(" ");
        double countWords = arrPhrase.length;
        double wordsLength = 0;
        for (String el : arrPhrase) {
            wordsLength += el.length();
        }
        return wordsLength / countWords;
    }
}

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}