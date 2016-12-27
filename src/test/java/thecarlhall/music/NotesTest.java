package thecarlhall.music;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotesTest {
    @Test
    public void shouldReturnNextSemiTone() {
        assertEquals(Notes.A_SHARP, Notes.A.next(1));
        assertEquals(Notes.B, Notes.A_SHARP.next(1));
        assertEquals(Notes.C, Notes.B.next(1));
        assertEquals(Notes.C_SHARP, Notes.C.next(1));
        assertEquals(Notes.D, Notes.C_SHARP.next(1));
        assertEquals(Notes.D_SHARP, Notes.D.next(1));
        assertEquals(Notes.E, Notes.D_SHARP.next(1));
        assertEquals(Notes.F, Notes.E.next(1));
        assertEquals(Notes.F_SHARP, Notes.F.next(1));
        assertEquals(Notes.G, Notes.F_SHARP.next(1));
        assertEquals(Notes.G_SHARP, Notes.G.next(1));
        assertEquals(Notes.A, Notes.G_SHARP.next(1));
    }

    @Test
    public void shouldReturnNextTone() {
        // start at A
        assertEquals(Notes.B, Notes.A.next(2));
        assertEquals(Notes.C_SHARP, Notes.B.next(2));
        assertEquals(Notes.D_SHARP, Notes.C_SHARP.next(2));
        assertEquals(Notes.F, Notes.D_SHARP.next(2));
        assertEquals(Notes.G, Notes.F.next(2));
        assertEquals(Notes.A, Notes.G.next(2));

        // start at A#
        assertEquals(Notes.C, Notes.A_SHARP.next(2));
        assertEquals(Notes.D, Notes.C.next(2));
        assertEquals(Notes.E, Notes.D.next(2));
        assertEquals(Notes.F_SHARP, Notes.E.next(2));
        assertEquals(Notes.G_SHARP, Notes.F_SHARP.next(2));
        assertEquals(Notes.A_SHARP, Notes.G_SHARP.next(2));
    }
}
