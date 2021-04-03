class PunctuationMarkCounter {
    public int count(String phrase) {
        int count = 0;
        String[] arrPhrase = phrase.split("");
        for (int i = 0; i < arrPhrase.length; i++) {
            if (arrPhrase[i].equals(".") || arrPhrase[i].equals(",") || arrPhrase[i].equals("!") || arrPhrase[i].equals(":") || arrPhrase[i].equals(";")) {
                count++;
            }
        }
        return count;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}