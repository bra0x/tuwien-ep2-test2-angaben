// Bitte nicht ändern. 'CheckMCTest' wird von anderen Klassen verwendet.
public class CheckMCTest {

    public static final String EXPECT =
            " 1. Welche der folgenden Aussagen treffen auf Klassen und Interfaces im\n" +
            "    Java-Collections-Framework zu?\n" +
            "    \n" +
            "    XXXXXXXXX LinkedHashMap<K,V> ist sowohl Hash-Tabelle als auch lineare Liste.\n" +
            "    XXXXXXXXX Set<E> erweitert Collection<E>, verbietet aber mehrfache Einträge.\n" +
            "    XXXXXXXXX LinkedList<E> implementiert Deque<E> als doppeltverkettete Liste.\n" +
            "    XXXXXXXXX LinkedList<E> implementiert Set<E> als einfachverkettete Liste.\n" +
            "    XXXXXXXXX Einträge in einem TreeSet<E> sind sortiert (über Iterator sichtbar).\n" +
            "\n" +
            " 2. Welche der folgenden Aussagen treffen auf die Ein- und Ausgabe über Streams in Java zu?\n" +
            "    \n" +
            "    XXXXXXXXX Puffer können als Wrapper vor nichtgepufferte Streams gehängt werden.\n" +
            "    XXXXXXXXX Ausgaben über gepufferte Streams gehen direkt an das Betriebssystem.\n" +
            "    XXXXXXXXX Streams vom Typ Reader wandeln die Kodierung automatisch um.\n" +
            "    XXXXXXXXX Gepufferte Streams sind meist effizienter als ungepufferte.\n" +
            "    XXXXXXXXX Streams werden nach der Verwendung mittels close() geschlossen.\n" +
            "\n" +
            " 3. Welche der folgenden Aussagen treffen auf die Einhaltung von Zusicherungen\n" +
            "    entsprechend Design-by-Contract zu?\n" +
            "    \n" +
            "    XXXXXXXXX Server können sich auf die Einhaltung ihrer Vorbedingungen verlassen.\n" +
            "    XXXXXXXXX Server müssen für die Einhaltung ihrer Vorbedingungen sorgen.\n" +
            "    XXXXXXXXX Clients müssen für die Einhaltung von Invarianten sorgen.\n" +
            "    XXXXXXXXX Server können sich auf die Einhaltung ihrer Nachbedingungen verlassen.\n" +
            "    XXXXXXXXX Clients müssen für die Einhaltung von Nachbedingungen sorgen.\n" +
            "\n" +
            " 4. public int median(int[] a) { return a[a.length / 2]; } \n" +
            "    Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
            "    dieser Methode sinnvoll sein?\n" +
            "    \n" +
            "    XXXXXXXXX Vorbedingung: Gibt den Median zurück wenn a sortiert ist.\n" +
            "    XXXXXXXXX Vorbedingung: a ist aufsteigend sortiert.\n" +
            "    XXXXXXXXX Vorbedingung: Greift auf einen Eintrag von a zu.\n" +
            "    XXXXXXXXX Nachbedingung: Gibt einen Eintrag etwa in der Mitte von a zurück.\n" +
            "    XXXXXXXXX Nachbedingung: Halbiert die Länge von a.\n" +
            "\n" +
            " 5. Welche der folgenden Aussagen treffen auf das Testen großer Programme zu?\n" +
            "    \n" +
            "    XXXXXXXXX Debugger eignen sich zum Aufdecken fast aller Fehlerursachen.\n" +
            "    XXXXXXXXX Experten für Softwaresicherheit sollen einbezogen werden.\n" +
            "    XXXXXXXXX Eine Code-Review hilft beim Auffinden von Fehlerursachen.\n" +
            "    XXXXXXXXX Black-Box-Testen leitet Testfälle aus Anwendungsfällen ab.\n" +
            "    XXXXXXXXX Mit absichtlichen Fehlern ist die Qualität des Testens prüfbar.\n" +
            "\n";

    public static final long UID = 8133854658831L;

}
