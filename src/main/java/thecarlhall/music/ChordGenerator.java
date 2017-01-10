package thecarlhall.music;

public class ChordGenerator {
    private final Notes rootNote;

    public ChordGenerator(Notes rootNote) {
        this.rootNote = rootNote;
    }

    public void printScale(Modes mode) {
        Notes current = rootNote;

        String format = "%15s - %s";

        int i = 0;
        String[] parts = new String[9];
        parts[i++] = mode.toString();
        parts[i++] = current.toString();

        for (int interval : mode.intervals) {
            current = current.next(interval);
            parts[i++] = current.toString();
            format += ", %s";
        }

        System.out.println(String.format(format, parts));
    }

    public static void main(String[] argv) {
        Notes root = Notes.C;
        if (argv.length >= 1) {
            root = Notes.valueOf(argv[0].toUpperCase());
        }

        ChordGenerator generator = new ChordGenerator(root);
        for (Modes mode : Modes.values()) {
            generator.printScale(mode);
        }
    }
}
