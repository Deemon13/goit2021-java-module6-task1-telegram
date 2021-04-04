class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        float freq = 0;
        String[] arrPhrase = phrase.toLowerCase().split(" ");
        float countWords = arrPhrase.length;
        for (String el : arrPhrase) {
            if (el.equals(word)) {
                freq++;
            }
        }
        return freq / countWords;
    }
}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
