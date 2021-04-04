class UniqueCharCounter {
    public int count(String phrase) {
        char characters[] = phrase.toLowerCase().toCharArray();
        int countOfUniqueChars = phrase.length();
        for (int i = 0; i < characters.length; i++) {
            if (i != phrase.toLowerCase().indexOf(characters[i])) {
                countOfUniqueChars--;
            }
        }
        return countOfUniqueChars;
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}