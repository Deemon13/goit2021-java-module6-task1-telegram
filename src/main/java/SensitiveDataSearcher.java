class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        String[] sensitiveWords = {"pass", "key", "login", "email"};
        String[] arrPhrase = phrase.split(" ");
        boolean presents = false;

        for (int i = 0; i < arrPhrase.length; i++) {
            for (int j = 0; j < sensitiveWords.length; j++) {
                if (arrPhrase[i].toLowerCase().contains(sensitiveWords[j].toLowerCase())) {
                    presents = true;
                }
            }
        }
        return presents;
    }
}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}