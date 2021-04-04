class MathDetector {
    public boolean isMath(String text) {
        char[] mathArr = {'=', '/', '*', '-', '+'};
        char[] arrText = text.toCharArray();
        for (char mathEl : mathArr) {
            for (char el : arrText) {
                if (el == mathEl) return true;
            }
        }
        return false;
    }
}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}