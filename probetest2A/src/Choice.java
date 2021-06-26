// Nicht ändern. 'Choice' wird von anderen Klassen verwendet.
public class Choice {
    private final String answer;
    private final boolean valid;

    public Choice(boolean valid, String answer) {
        this.answer = answer;
        this.valid = valid;
    }

    public String answer() {
        return answer;
    }

    public boolean valid() {
        return valid;
    }

    @Override
    public String toString() {
        return (valid ? "Richtig:  " : "Falsch:   ") + answer;
    }
}
