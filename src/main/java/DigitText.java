class DigitText{
    public boolean detect(String text){
        char[] arrText = text.replace(" ", "").toCharArray();
        boolean detected = true;
        for (char el : arrText) {
            if (el < '0' || el > '9') {
                detected = false;
            }
        }
        return detected;
    }
}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}