class DoubleSpaceCleaner {
    public String clean(String phrase) {
        String newPhrase = phrase.trim();
        String[] words = newPhrase.split(" ");
        String[] result = new String[words.length];
        int count = 0;
        int countNull = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                result[count++] = words[i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] == null) {
                countNull++;
            }
        }
        String[] resultWithoutNulls = new String[result.length - countNull];
        for (int i = 0, j = 0; i < result.length; i++, j++) {
            if (result[i] != null) {
                resultWithoutNulls[j] = result[i];
            }
        }
        String str = String.join(" ", resultWithoutNulls);
        return str;
    }
}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}