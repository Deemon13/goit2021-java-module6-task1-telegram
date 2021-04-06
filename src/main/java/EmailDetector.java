class EmailDetector {
    public boolean isPresent(String text) {
        String[] arrText = text.split(" ");

        for (String el : arrText) {
            if (el.contains("@")) {
                if (el.indexOf("@") > 1 && el.length() > el.indexOf("@") + 2) {
                    return true;
                }
            }
        }
        return false;
    }
}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}