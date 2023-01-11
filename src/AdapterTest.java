public class AdapterTest {
    public static void main(String[] args) {
        StackAdapter<String> stack = new StackAdapter<>();

        System.out.println("Ist der Stack zu Beginn leer? " + stack.empty());
        System.out.println("Hinzufügen:" + stack.push("HALLO"));
        System.out.println("Hinzufügen:" + stack.push("WIE"));
        System.out.println("Hinzufügen:" + stack.push("GEHT"));
        System.out.println("Hinzufügen:" + stack.push("ES"));
        System.out.println("Hinzufügen:" + stack.push("DIR?"));
        System.out.println("Letztes Element entfernt: " + stack.pop());
        System.out.println("Neues letztes Element: " + stack.peek());
        System.out.println("Ist der Stack am Ende leer? " + stack.empty());

    }
}