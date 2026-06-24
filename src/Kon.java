import java.util.Scanner;

public class Kon {
    // Ein zentraler Scanner für die Konsole
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Liest eine Ganzzahl (int) von der Konsole ein.
     * @param aufforderung Der Text, der vor der Eingabe angezeigt wird.
     * @return Die eingegebene Zahl.
     */
    public static int readInt(String aufforderung) {
        System.out.print(aufforderung);

        // Schleife läuft so lange, bis der Benutzer eine gültige Zahl eingibt
        while (!scanner.hasNextInt()) {
            System.out.println("Fehler: Bitte geben Sie eine gültige Zahl ein!");
            System.out.print(aufforderung);
            scanner.next(); // Ungültige Eingabe verwerfen
        }

        int zahl = scanner.nextInt();
        scanner.nextLine(); // Den Zeilenumbruch aus dem Puffer löschen
        return zahl;
    }
}
