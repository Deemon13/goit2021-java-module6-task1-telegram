class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        String[] arrSourceWord = sourceWord.toLowerCase().split("");
        String[] arrTargetWord = targetWord.toLowerCase().split("");
        boolean combined = false;

        for (String elSource : arrSourceWord) {
            for (String elTarget : arrTargetWord) {
                if (elTarget.equals(elSource)) {
                    combined = true;
                }
            }
        }
        return combined;
    }
}

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}