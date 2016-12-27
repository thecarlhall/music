package thecarlhall.music;

public enum Notes {
    A, A_SHARP("A#/Bb"),
    B,
    C, C_SHARP("C#/Db"),
    D, D_SHARP("D#/Eb"),
    E,
    F, F_SHARP("F#/Gb"),
    G, G_SHARP("G#/Ab");

    public final String display;

    Notes() {
        this.display = name();
    }

    Notes(String display) {
        this.display = display;
    }

    /**
     * Get the chromatic next note.
     *
     * @param interval How many steps (semitones) to look forward.
     * @return The nth next note with wrapping around the scale.
     */
    public Notes next(int interval) {
        int next = ordinal() + interval;
        int adjNext = next % Notes.values().length;
        return Notes.values()[adjNext];
    }

    public String toString() {
        return display;
    }
}
