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

/** Callback function: {@link #invoke GLFWframebuffersizefun} */
public abstract class GLFWFramebufferSizeCallback extends Callback implements GLFWFramebufferSizeCallbackI {

    /**
     * Creates a {@code GLFWFramebufferSizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWFramebufferSizeCallback}
     */
    public static GLFWFramebufferSizeCallback create(long functionPointer) {
        GLFWFramebufferSizeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWFramebufferSizeCallback
            ? (GLFWFramebufferSizeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWFramebufferSizeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWFramebufferSizeCallback} instance that delegates to the specified {@code GLFWFramebufferSizeCallbackI} instance. */
    public static GLFWFramebufferSizeCallback create(GLFWFramebufferSizeCallbackI instance) {
        return instance instanceof GLFWFramebufferSizeCallback
            ? (GLFWFramebufferSizeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWFramebufferSizeCallback() {
        super(CIF);
    }

    GLFWFramebufferSizeCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback}. */
    public GLFWFramebufferSizeCallback set(long window) {
        glfwSetFramebufferSizeCallback(window, this);
        return this;
    }

    private static final class Container extends GLFWFramebufferSizeCallback {

        private final GLFWFramebufferSizeCallbackI delegate;

        Container(long functionPointer, GLFWFramebufferSizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long window, int width, int height) {
            delegate.invoke(window, width, height);
        }

    }

}