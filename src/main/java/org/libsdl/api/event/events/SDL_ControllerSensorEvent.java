package org.libsdl.api.event.events;

import com.sun.jna.Structure;
import org.intellij.lang.annotations.MagicConstant;
import org.libsdl.api.joystick.SDL_JoystickID;
import org.libsdl.api.sensor.SDL_SensorType;
import org.libsdl.jna.JnaStructure;

import static org.libsdl.api.event.SDL_EventType.SDL_CONTROLLERSENSORUPDATE;

@Structure.FieldOrder({
        "type",
        "timestamp",
        "which",
        "sensor",
        "data"
})
public final class SDL_ControllerSensorEvent extends JnaStructure {

    @MagicConstant(intValues = SDL_CONTROLLERSENSORUPDATE)
    public int type;
    public int timestamp;
    public SDL_JoystickID which;

    @MagicConstant(valuesFromClass = SDL_SensorType.class)
    public int sensor;
    public float[] data = new float[3];
}
