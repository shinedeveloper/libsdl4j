package org.libsdl.api.pixels;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import org.libsdl.jna.JnaStructure;

@Structure.FieldOrder({
        "ncolors",
        "colors",
        "version",
        "refcount"
})
public class SDL_Palette extends JnaStructure {

    public int ncolors;
    public SDL_Color.Ref colors;
    public int version;
    public int refcount;

    public SDL_Palette() {
    }

    public SDL_Palette(Pointer p) {
        super(p);
    }

    public static class Ref extends SDL_Palette implements Structure.ByReference {

        public Ref() {
        }

        public Ref(Pointer p) {
            super(p);
        }
    }
}
