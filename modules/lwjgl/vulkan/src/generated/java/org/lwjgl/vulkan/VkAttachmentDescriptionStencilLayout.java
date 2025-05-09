/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkAttachmentDescriptionStencilLayout {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkImageLayout stencilInitialLayout;
 *     VkImageLayout stencilFinalLayout;
 * }}</pre>
 */
public class VkAttachmentDescriptionStencilLayout extends Struct<VkAttachmentDescriptionStencilLayout> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STENCILINITIALLAYOUT,
        STENCILFINALLAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STENCILINITIALLAYOUT = layout.offsetof(2);
        STENCILFINALLAYOUT = layout.offsetof(3);
    }

    protected VkAttachmentDescriptionStencilLayout(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAttachmentDescriptionStencilLayout create(long address, @Nullable ByteBuffer container) {
        return new VkAttachmentDescriptionStencilLayout(address, container);
    }

    /**
     * Creates a {@code VkAttachmentDescriptionStencilLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentDescriptionStencilLayout(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code stencilInitialLayout} field. */
    @NativeType("VkImageLayout")
    public int stencilInitialLayout() { return nstencilInitialLayout(address()); }
    /** @return the value of the {@code stencilFinalLayout} field. */
    @NativeType("VkImageLayout")
    public int stencilFinalLayout() { return nstencilFinalLayout(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAttachmentDescriptionStencilLayout sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT} value to the {@code sType} field. */
    public VkAttachmentDescriptionStencilLayout sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAttachmentDescriptionStencilLayout pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stencilInitialLayout} field. */
    public VkAttachmentDescriptionStencilLayout stencilInitialLayout(@NativeType("VkImageLayout") int value) { nstencilInitialLayout(address(), value); return this; }
    /** Sets the specified value to the {@code stencilFinalLayout} field. */
    public VkAttachmentDescriptionStencilLayout stencilFinalLayout(@NativeType("VkImageLayout") int value) { nstencilFinalLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentDescriptionStencilLayout set(
        int sType,
        long pNext,
        int stencilInitialLayout,
        int stencilFinalLayout
    ) {
        sType(sType);
        pNext(pNext);
        stencilInitialLayout(stencilInitialLayout);
        stencilFinalLayout(stencilFinalLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentDescriptionStencilLayout set(VkAttachmentDescriptionStencilLayout src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentDescriptionStencilLayout} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescriptionStencilLayout malloc() {
        return new VkAttachmentDescriptionStencilLayout(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayout} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescriptionStencilLayout calloc() {
        return new VkAttachmentDescriptionStencilLayout(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayout} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentDescriptionStencilLayout create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentDescriptionStencilLayout(memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayout} instance for the specified memory address. */
    public static VkAttachmentDescriptionStencilLayout create(long address) {
        return new VkAttachmentDescriptionStencilLayout(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAttachmentDescriptionStencilLayout createSafe(long address) {
        return address == NULL ? null : new VkAttachmentDescriptionStencilLayout(address, null);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayout.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayout.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayout.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAttachmentDescriptionStencilLayout.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAttachmentDescriptionStencilLayout.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAttachmentDescriptionStencilLayout} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescriptionStencilLayout malloc(MemoryStack stack) {
        return new VkAttachmentDescriptionStencilLayout(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAttachmentDescriptionStencilLayout} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescriptionStencilLayout calloc(MemoryStack stack) {
        return new VkAttachmentDescriptionStencilLayout(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayout.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayout.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayout.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAttachmentDescriptionStencilLayout.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAttachmentDescriptionStencilLayout.PNEXT); }
    /** Unsafe version of {@link #stencilInitialLayout}. */
    public static int nstencilInitialLayout(long struct) { return memGetInt(struct + VkAttachmentDescriptionStencilLayout.STENCILINITIALLAYOUT); }
    /** Unsafe version of {@link #stencilFinalLayout}. */
    public static int nstencilFinalLayout(long struct) { return memGetInt(struct + VkAttachmentDescriptionStencilLayout.STENCILFINALLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAttachmentDescriptionStencilLayout.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAttachmentDescriptionStencilLayout.PNEXT, value); }
    /** Unsafe version of {@link #stencilInitialLayout(int) stencilInitialLayout}. */
    public static void nstencilInitialLayout(long struct, int value) { memPutInt(struct + VkAttachmentDescriptionStencilLayout.STENCILINITIALLAYOUT, value); }
    /** Unsafe version of {@link #stencilFinalLayout(int) stencilFinalLayout}. */
    public static void nstencilFinalLayout(long struct, int value) { memPutInt(struct + VkAttachmentDescriptionStencilLayout.STENCILFINALLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkAttachmentDescriptionStencilLayout} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentDescriptionStencilLayout, Buffer> implements NativeResource {

        private static final VkAttachmentDescriptionStencilLayout ELEMENT_FACTORY = VkAttachmentDescriptionStencilLayout.create(-1L);

        /**
         * Creates a new {@code VkAttachmentDescriptionStencilLayout.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentDescriptionStencilLayout#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkAttachmentDescriptionStencilLayout getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAttachmentDescriptionStencilLayout.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAttachmentDescriptionStencilLayout.npNext(address()); }
        /** @return the value of the {@code stencilInitialLayout} field. */
        @NativeType("VkImageLayout")
        public int stencilInitialLayout() { return VkAttachmentDescriptionStencilLayout.nstencilInitialLayout(address()); }
        /** @return the value of the {@code stencilFinalLayout} field. */
        @NativeType("VkImageLayout")
        public int stencilFinalLayout() { return VkAttachmentDescriptionStencilLayout.nstencilFinalLayout(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAttachmentDescriptionStencilLayout.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentDescriptionStencilLayout.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT} value to the {@code sType} field. */
        public VkAttachmentDescriptionStencilLayout.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAttachmentDescriptionStencilLayout.Buffer pNext(@NativeType("void *") long value) { VkAttachmentDescriptionStencilLayout.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stencilInitialLayout} field. */
        public VkAttachmentDescriptionStencilLayout.Buffer stencilInitialLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayout.nstencilInitialLayout(address(), value); return this; }
        /** Sets the specified value to the {@code stencilFinalLayout} field. */
        public VkAttachmentDescriptionStencilLayout.Buffer stencilFinalLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayout.nstencilFinalLayout(address(), value); return this; }

    }

}