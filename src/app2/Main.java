package app2;

public class Main {

    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        Corrector corrector = new Corrector();

        String output = corrector.handleData(provider.getData());
        getOutput(output);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}

