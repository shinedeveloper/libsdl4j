package org.libsdl.api.clipboard;

import com.sun.jna.Pointer;
import org.libsdl.jna.JnaUtils;
import org.libsdl.jna.SdlNativeLibraryLoader;

public final class SdlClipboard {

    static {
        SdlNativeLibraryLoader.registerNativeMethods(SdlClipboard.class);
    }

    private SdlClipboard() {
    }

    public static native int SDL_SetClipboardText(
            String text);

    public static String SDL_GetClipboardText() {
        Pointer text = InternalNativeFunctions.SDL_GetClipboardText();
        return JnaUtils.extractStringAndReleaseNativeSdlMemory(text);
    }

    public static native boolean SDL_HasClipboardText();

    private static final class InternalNativeFunctions {

        static {
            SdlNativeLibraryLoader.registerNativeMethods(InternalNativeFunctions.class);
        }

        private InternalNativeFunctions() {
        }

        public static native Pointer SDL_GetClipboardText();
    }
}
