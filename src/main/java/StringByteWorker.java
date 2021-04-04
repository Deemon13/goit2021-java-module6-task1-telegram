class StringByteWorker {
    public String process(byte[] bytes) {
        String strBytes = new String(bytes);
        return strBytes.toLowerCase();
    }
}

class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}