/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_STUDIO_EVENT_CALLBACK} */
public abstract class FMOD_STUDIO_EVENT_CALLBACK extends Callback implements FMOD_STUDIO_EVENT_CALLBACKI {

    /**
     * Creates a {@code FMOD_STUDIO_EVENT_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_STUDIO_EVENT_CALLBACK}
     */
    public static FMOD_STUDIO_EVENT_CALLBACK create(long functionPointer) {
        FMOD_STUDIO_EVENT_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_STUDIO_EVENT_CALLBACK
            ? (FMOD_STUDIO_EVENT_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_STUDIO_EVENT_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_STUDIO_EVENT_CALLBACK} instance that delegates to the specified {@code FMOD_STUDIO_EVENT_CALLBACKI} instance. */
    public static FMOD_STUDIO_EVENT_CALLBACK create(FMOD_STUDIO_EVENT_CALLBACKI instance) {
        return instance instanceof FMOD_STUDIO_EVENT_CALLBACK
            ? (FMOD_STUDIO_EVENT_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_STUDIO_EVENT_CALLBACK() {
        super(CIF);
    }

    FMOD_STUDIO_EVENT_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_STUDIO_EVENT_CALLBACK {

        private final FMOD_STUDIO_EVENT_CALLBACKI delegate;

        Container(long functionPointer, FMOD_STUDIO_EVENT_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int type, long event, long parameters) {
            return delegate.invoke(type, event, parameters);
        }

    }

}