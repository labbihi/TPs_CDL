package Adapter;

public class Main {

    public static void main(String[] args) {
        // Utilisation
        DataProcessor processor = new ThirdPartAdapter(new ThirdPartyLibrary());
        processor.process("Données à traiter");
    }
}
