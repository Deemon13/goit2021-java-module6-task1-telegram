class ShortWordCounter {
    public int count(String phrase, int minLength) {
        int countMinLength = 0;
        String[] arrPhrase = phrase.split(" ");
        for (String el : arrPhrase) {
            if (el.length() <= minLength) {
                countMinLength++;
            }
        }
        return countMinLength;
    }
}

class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}