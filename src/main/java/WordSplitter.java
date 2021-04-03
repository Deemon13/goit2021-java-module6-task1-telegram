import java.util.Arrays;

class WordSplitter {
    public static String[] split(String phrase) {
        String [] words = phrase.split(" ");
        String [] result = new String[words.length];
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) result[count++] = word.toLowerCase();
        }
        return result.length == count ? result : Arrays.copyOfRange(result, 0, count);
    }
}

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        //[hello, world]
        System.out.println(Arrays.toString(wordSplitter.split("Hello      world")));

        //[this, is, sparta]
        System.out.println(Arrays.toString(wordSplitter.split("This is Sparta")));
    }
}