/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Callback function: {@link #invoke GLFWcharmodsfun} */
public abstract class GLFWCharModsCallback extends Callback implements GLFWCharModsCallbackI {

    /**
     * Creates a {@code GLFWCharModsCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWCharModsCallback}
     */
    public static GLFWCharModsCallback create(long functionPointer) {
        GLFWCharModsCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWCharModsCallback
            ? (GLFWCharModsCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWCharModsCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWCharModsCallback} instance that delegates to the specified {@code GLFWCharModsCallbackI} instance. */
    public static GLFWCharModsCallback create(GLFWCharModsCallbackI instance) {
        return instance instanceof GLFWCharModsCallback
            ? (GLFWCharModsCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWCharModsCallback() {
        super(CIF);
    }

    GLFWCharModsCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetCharModsCallback SetCharModsCallback}. */
    public GLFWCharModsCallback set(long window) {
        glfwSetCharModsCallback(window, this);
        return this;
    }

    private static final class Container extends GLFWCharModsCallback {

        private final GLFWCharModsCallbackI delegate;

        Container(long functionPointer, GLFWCharModsCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long window, int codepoint, int mods) {
            delegate.invoke(window, codepoint, mods);
        }

    }

}