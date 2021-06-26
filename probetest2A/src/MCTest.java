// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MCTest {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen (oder auf 'false' zurückändern).
    // Kommentare sind erlaubt, wirken sich aber nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle MCTest ausführen.
    public static void main(String[] args) {
        MCQuestion.checkAndPrint(

                new MCQuestion(
                        "Welche der folgenden Aussagen treffen auf Klassen und Interfaces im\n" +
                        "Java-Collections-Framework zu?",

                        new Choice(true, "LinkedHashMap<K,V> ist sowohl Hash-Tabelle als auch lineare Liste."),
                        new Choice(true, "Set<E> erweitert Collection<E>, verbietet aber mehrfache Einträge."),
                        new Choice(true, "LinkedList<E> implementiert Deque<E> als doppeltverkettete Liste."),
                        new Choice(false, "LinkedList<E> implementiert Set<E> als einfachverkettete Liste."),
                        new Choice(true, "Einträge in einem TreeSet<E> sind sortiert (über Iterator sichtbar).")
                ),

                new MCQuestion(
                        "Welche der folgenden Aussagen treffen auf die Ein- und Ausgabe über Streams in Java zu?",

                        new Choice(true, "Puffer können als Wrapper vor nichtgepufferte Streams gehängt werden."),
                        new Choice(false, "Ausgaben über gepufferte Streams gehen direkt an das Betriebssystem."),
                        new Choice(true, "Streams vom Typ Reader wandeln die Kodierung automatisch um."),
                        new Choice(true, "Gepufferte Streams sind meist effizienter als ungepufferte."),
                        new Choice(true, "Streams werden nach der Verwendung mittels close() geschlossen.")
                ),

                new MCQuestion(
                        "Welche der folgenden Aussagen treffen auf die Einhaltung von Zusicherungen\n" +
                        "entsprechend Design-by-Contract zu?",

                        new Choice(true, "Server können sich auf die Einhaltung ihrer Vorbedingungen verlassen."),
                        new Choice(false, "Server müssen für die Einhaltung ihrer Vorbedingungen sorgen."),
                        new Choice(false, "Clients müssen für die Einhaltung von Invarianten sorgen."),
                        new Choice(false, "Server können sich auf die Einhaltung ihrer Nachbedingungen verlassen."),
                        new Choice(false, "Clients müssen für die Einhaltung von Nachbedingungen sorgen.")
                ),

                new MCQuestion(
                        "public int median(int[] a) { return a[a.length / 2]; } \n" +
                        "Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
                        "dieser Methode sinnvoll sein?",

                        new Choice(false, "Vorbedingung: Gibt den Median zurück wenn a sortiert ist."),
                        new Choice(true, "Vorbedingung: a ist aufsteigend sortiert."),
                        new Choice(false, "Vorbedingung: Greift auf einen Eintrag von a zu."),
                        new Choice(true, "Nachbedingung: Gibt einen Eintrag etwa in der Mitte von a zurück."),
                        new Choice(false, "Nachbedingung: Halbiert die Länge von a.")
                ),

                new MCQuestion(
                        "Welche der folgenden Aussagen treffen auf das Testen großer Programme zu?",

                        new Choice(false, "Debugger eignen sich zum Aufdecken fast aller Fehlerursachen."),
                        new Choice(true, "Experten für Softwaresicherheit sollen einbezogen werden."),
                        new Choice(true, "Eine Code-Review hilft beim Auffinden von Fehlerursachen."),
                        new Choice(true, "Black-Box-Testen leitet Testfälle aus Anwendungsfällen ab."),
                        new Choice(true, "Mit absichtlichen Fehlern ist die Qualität des Testens prüfbar.")
                )
        );
    }

    public static final long UID = 8133854658831L;

}
