import java.util.Arrays;

class DigitExtracter {
    public int[] extract(String text) {
        char[] arrText = text.toCharArray();
        int countNumbers = 0;

        for (char el : arrText) {
            if (el >= '0' && el <= '9') {
                countNumbers++;
            }
        }

        int count = 0;
        int[] numbers = new int[countNumbers];

        for (int i = 0; i < arrText.length; i++) {
            if (arrText[i] >= '0' && arrText[i] <= '9') {
                numbers[count++] = Character.getNumericValue(arrText[i]);
            }
        }

        return numbers;
    }
}

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        //int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(digitExtracter.extract("april 5, year 2000")));
        //[7, 1, 8, 7, 4, 6, 3, 0]
        System.out.println(Arrays.toString(digitExtracter.extract("vy ja 71874630 puk guiqw ce ojwax agcyd boe")));
        //[3, 3, 4, 4, 7, 5, 5, 6, 7, 2]
        System.out.println(Arrays.toString(digitExtracter.extract("3 no hiyp ab afguy 3 giv 4 ny 4 yr 75 5672 luq cy")));
    }
}