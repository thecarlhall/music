package thecarlhall.music;

public enum Modes {
    IONIAN(1, new int[]{2, 2, 1, 2, 2, 2, 1}),
    DORIAN(2, new int[]{2, 1, 2, 2, 2, 1, 2}),
    PHRYGIAN(3, new int[]{1, 2, 2, 2, 1, 2, 2}),
    LYDIAN(4, new int[]{2, 2, 2, 1, 2, 2, 1}),
    MIXOLYDIAN(5, new int[]{2, 2, 1, 2, 2, 1, 2}),
    AEOLIAN(6, new int[]{2, 1, 2, 2, 1, 2, 2}),
    LOCRIAN(7, new int[]{1, 2, 2, 1, 2, 2, 2}),
    MAJOR_PENTA(1, new int[]{2, 2, 3, 2, 3}),
    MINOR_PENTA(1, new int[]{3, 2, 2, 3, 2}),
    BLUES(1, new int[]{3, 2, 1, 1, 3, 2});

    public final int tonic;
    public final int[] intervals;

    Modes(int tonic, int[] intervals) {
        this.tonic = tonic;
        this.intervals = intervals;
    }

    public String toString() {
        return name() + " (" + tonic + ")";
    }
}
