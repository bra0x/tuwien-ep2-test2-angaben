import java.util.Scanner;

// Bitte nicht ändern. 'MCQuestion' wird von anderen Klassen verwendet.
public class MCQuestion {
    private final String question;
    private final Choice[] choices;

    public MCQuestion(String question, Choice... choices) {
        this.question = question;
        this.choices = choices;
    }

    public String question() {
        return question;
    }

    public Choice[] choices() {
        return choices;
    }

    @Override
    public String toString() {
        String s = question + "\n\n";
        for (Choice choice : choices) {
            s += choice + "\n";
        }
        return s;
    }


    public static void checkAndPrint(MCQuestion... mcQuestions) {
        int i = 1;
        String s = "";
        for (MCQuestion question : mcQuestions) {
            Scanner scanner = new Scanner(question.toString());
            s += String.format("%2d. %s\n", i++, scanner.nextLine());
            while (scanner.hasNextLine()) {
                s += String.format("    %s\n", scanner.nextLine());
            }
            s += "\n";
        }
        String converted = s.replace("Richtig: ", "XXXXXXXXX").replace("Falsch:  ", "XXXXXXXXX");
        if (!converted.equals(CheckMCTest.EXPECT)) {
            i = 0;
            String err = "\n";
            Scanner e = new Scanner(CheckMCTest.EXPECT);
            Scanner f = new Scanner(converted);
            while (e.hasNextLine() && f.hasNextLine() && i < 5) {
                String el = e.nextLine(), fl = f.nextLine();
                if (!el.equals(fl) && !"".equals(el.trim()) && !"".equals(fl.trim())) {
                    i++;
                    err += "Statt der Zeile: " + fl + "\nsollte stehen:   " + el + "\n\n";
                }
            }
            if (i >= 5) {
                err = "Das waren die ursprünglichen Fragen und Antwortmöglichkeiten:\n\n" + CheckMCTest.EXPECT;
            }
            System.out.println("ACHTUNG: Sie haben Programmteile verändert, die nicht geändert werden sollten.\n" +
                    "Beurteilt wird so, als ob diese Programmteile unverändert geblieben wären.\n" +
                    err);
            System.exit(1);
        }
        System.out.println("Die Multiple-Choice-Fragen wurden folgendermaßen beantwortet\n" +
                "(das sind nur Ihre Antworten, keine Aussage über Korrektheit):\n\n" +
                s);
        if (MCTest.UID != CheckMCTest.UID) {
            System.exit(2);
        }
        System.exit(0);
    }

}
