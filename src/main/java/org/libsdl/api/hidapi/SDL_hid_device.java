package org.libsdl.api.hidapi;

import com.sun.jna.Pointer;
import com.sun.jna.PointerType;

public final class SDL_hid_device extends PointerType {

    public SDL_hid_device() {
        super();
    }

    public SDL_hid_device(Pointer p) {
        super(p);
    }
}
