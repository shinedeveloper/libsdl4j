package org.libsdl.api.syswm;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import org.libsdl.jna.JnaStructure;

@Structure.FieldOrder({
        "window",
        "framebuffer",
        "colorbuffer",
        "resolveFramebuffer"
})
public class SDL_SysWMInfoUIKit extends JnaStructure {

    /** The UIKit window */
    public Pointer window;

    /** The GL view's Framebuffer Object. It must be bound when rendering to the screen using GL. */
    public int framebuffer;

    /** The GL view's color Renderbuffer Object. It must be bound when SDL_GL_SwapWindow is called. */
    public int colorbuffer;

    /** The Framebuffer Object which holds the resolve color Renderbuffer, when MSAA is used. */
    public int resolveFramebuffer;
}
