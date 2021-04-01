class GooWordStat {
    private String word;
    private int freq;

    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    @Override
    public String toString() {
        String freqName = "";
        if (freq < 1000) {
            freqName = "LOW";
        } else if (freq >= 1000 && freq < 100000) {
            freqName = "MEDIUM";
        } else if (freq >= 100000 && freq < 10000000) {
            freqName = "HIGH";
        } else if (freq >= 10000000) {
            freqName = "EXTRA HIGH";
        }
        return "Word is [" + word + "], search freq is " + freqName;
    }
}

class GooWordStatTest {
    public static void main(String[] args) {
        //Word is [human], search freq is LOW
        System.out.println(new GooWordStat("human", 10));

        //Word is [mars], search freq is MEDIUM
        System.out.println(new GooWordStat("mars", 10000));

        //Word is [space], search freq is HIGH
        System.out.println(new GooWordStat("space", 9965499));

        //Word is [life], search freq is EXTRA HIGH
        System.out.println(new GooWordStat("life", 564785654));
    }
}