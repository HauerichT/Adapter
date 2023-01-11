public class AdapterTest {
    public static void main(String[] args) {
        // Initialisierung des Stack-Adapters
        StackAdapter<String> stackAdapter = new StackAdapter<>();

        // Testszenario
        System.out.println("Ist der Stack zu Beginn leer? " + stackAdapter.empty());
        System.out.println("Hinzufügen: " + stackAdapter.push("HALLO"));
        System.out.println("Hinzufügen: " + stackAdapter.push("WIE"));
        System.out.println("Hinzufügen: " + stackAdapter.push("GEHT"));
        System.out.println("Hinzufügen: " + stackAdapter.push("ES"));
        System.out.println("Hinzufügen: " + stackAdapter.push("DIR?"));
        System.out.println("Oberstes Element vom Stack entfernt: " + stackAdapter.pop());
        System.out.println("Neues oberstes Element: " + stackAdapter.peek());
        System.out.println("Oberstes Element vom Stack entfernt: " + stackAdapter.pop());
        System.out.println("Neues oberstes Element: " + stackAdapter.peek());
        System.out.println("Ist der Stack am Ende leer? " + stackAdapter.empty());
    }
}