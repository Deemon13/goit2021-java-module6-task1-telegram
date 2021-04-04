class PalindromeCounter {
    public int count(String phrase) {
        int countPalindromes = 0;
        String[] arrPhrase = phrase.split(" ");
        for (String el : arrPhrase) {
            String reverseEl = new StringBuffer(el).reverse().toString();
            if (el.toLowerCase().equals(reverseEl.toLowerCase())) {
                countPalindromes++;
            }
        }
        return countPalindromes;
    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}