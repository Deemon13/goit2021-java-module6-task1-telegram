class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        float freq = 0;
        String[] arrPhrase = phrase.toLowerCase().split(" ");
        float countWords = arrPhrase.length;
        for (String el : arrPhrase) {
            if (el.equals(word.toLowerCase())) {
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
        //0.1428571492433548
        System.out.println(freqCounter.countFreq("syhemidoxix di sava Otrujasaby paybnudou ihdapoqaypb hiut", "Otrujasaby"));
        //0.2222222238779068
        System.out.println(freqCounter.countFreq("wodeciwyeqq nuacrezy Noobduxu xowehe havacibafeg Noobduxu pe ibaxpoq avwep", "Noobduxu"));
    }
}
