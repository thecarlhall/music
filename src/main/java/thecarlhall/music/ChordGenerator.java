package thecarlhall.music;

public class ChordGenerator {
    private static final String FORMAT = "%14s - %s, %s, %s, %s, %s, %s, %s, %s";
    private final Notes rootNote;

    public ChordGenerator(Notes rootNote) {
        this.rootNote = rootNote;
    }

    public void printScale(Modes mode) {
        Notes current = rootNote;

        int i = 0;
        String[] parts = new String[9];
        parts[i++] = mode.toString();
        parts[i++] = current.toString();

        for (int interval : mode.intervals) {
            current = current.next(interval);
            parts[i++] = current.toString();
        }

        System.out.println(String.format(FORMAT, parts));
    }

    public static void main(String[] argv) {
        ChordGenerator generator = new ChordGenerator(Notes.C);
        for (Modes mode : Modes.values()) {
            generator.printScale(mode);
        }
    }
}
