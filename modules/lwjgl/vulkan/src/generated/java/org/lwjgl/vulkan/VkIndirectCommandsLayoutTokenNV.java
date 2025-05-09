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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkIndirectCommandsLayoutTokenNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkIndirectCommandsTokenTypeNV tokenType;
 *     uint32_t stream;
 *     uint32_t offset;
 *     uint32_t vertexBindingUnit;
 *     VkBool32 vertexDynamicStride;
 *     VkPipelineLayout pushconstantPipelineLayout;
 *     VkShaderStageFlags pushconstantShaderStageFlags;
 *     uint32_t pushconstantOffset;
 *     uint32_t pushconstantSize;
 *     VkIndirectStateFlagsNV indirectStateFlags;
 *     uint32_t indexTypeCount;
 *     VkIndexType const * pIndexTypes;
 *     uint32_t const * pIndexTypeValues;
 * }}</pre>
 */
public class VkIndirectCommandsLayoutTokenNV extends Struct<VkIndirectCommandsLayoutTokenNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TOKENTYPE,
        STREAM,
        OFFSET,
        VERTEXBINDINGUNIT,
        VERTEXDYNAMICSTRIDE,
        PUSHCONSTANTPIPELINELAYOUT,
        PUSHCONSTANTSHADERSTAGEFLAGS,
        PUSHCONSTANTOFFSET,
        PUSHCONSTANTSIZE,
        INDIRECTSTATEFLAGS,
        INDEXTYPECOUNT,
        PINDEXTYPES,
        PINDEXTYPEVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TOKENTYPE = layout.offsetof(2);
        STREAM = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        VERTEXBINDINGUNIT = layout.offsetof(5);
        VERTEXDYNAMICSTRIDE = layout.offsetof(6);
        PUSHCONSTANTPIPELINELAYOUT = layout.offsetof(7);
        PUSHCONSTANTSHADERSTAGEFLAGS = layout.offsetof(8);
        PUSHCONSTANTOFFSET = layout.offsetof(9);
        PUSHCONSTANTSIZE = layout.offsetof(10);
        INDIRECTSTATEFLAGS = layout.offsetof(11);
        INDEXTYPECOUNT = layout.offsetof(12);
        PINDEXTYPES = layout.offsetof(13);
        PINDEXTYPEVALUES = layout.offsetof(14);
    }

    protected VkIndirectCommandsLayoutTokenNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsLayoutTokenNV create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsLayoutTokenNV(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsLayoutTokenNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsLayoutTokenNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code tokenType} field. */
    @NativeType("VkIndirectCommandsTokenTypeNV")
    public int tokenType() { return ntokenType(address()); }
    /** @return the value of the {@code stream} field. */
    @NativeType("uint32_t")
    public int stream$() { return nstream$(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }
    /** @return the value of the {@code vertexBindingUnit} field. */
    @NativeType("uint32_t")
    public int vertexBindingUnit() { return nvertexBindingUnit(address()); }
    /** @return the value of the {@code vertexDynamicStride} field. */
    @NativeType("VkBool32")
    public boolean vertexDynamicStride() { return nvertexDynamicStride(address()) != 0; }
    /** @return the value of the {@code pushconstantPipelineLayout} field. */
    @NativeType("VkPipelineLayout")
    public long pushconstantPipelineLayout() { return npushconstantPipelineLayout(address()); }
    /** @return the value of the {@code pushconstantShaderStageFlags} field. */
    @NativeType("VkShaderStageFlags")
    public int pushconstantShaderStageFlags() { return npushconstantShaderStageFlags(address()); }
    /** @return the value of the {@code pushconstantOffset} field. */
    @NativeType("uint32_t")
    public int pushconstantOffset() { return npushconstantOffset(address()); }
    /** @return the value of the {@code pushconstantSize} field. */
    @NativeType("uint32_t")
    public int pushconstantSize() { return npushconstantSize(address()); }
    /** @return the value of the {@code indirectStateFlags} field. */
    @NativeType("VkIndirectStateFlagsNV")
    public int indirectStateFlags() { return nindirectStateFlags(address()); }
    /** @return the value of the {@code indexTypeCount} field. */
    @NativeType("uint32_t")
    public int indexTypeCount() { return nindexTypeCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pIndexTypes} field. */
    @NativeType("VkIndexType const *")
    public @Nullable IntBuffer pIndexTypes() { return npIndexTypes(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pIndexTypeValues} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pIndexTypeValues() { return npIndexTypeValues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkIndirectCommandsLayoutTokenNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV} value to the {@code sType} field. */
    public VkIndirectCommandsLayoutTokenNV sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkIndirectCommandsLayoutTokenNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tokenType} field. */
    public VkIndirectCommandsLayoutTokenNV tokenType(@NativeType("VkIndirectCommandsTokenTypeNV") int value) { ntokenType(address(), value); return this; }
    /** Sets the specified value to the {@code stream} field. */
    public VkIndirectCommandsLayoutTokenNV stream$(@NativeType("uint32_t") int value) { nstream$(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkIndirectCommandsLayoutTokenNV offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code vertexBindingUnit} field. */
    public VkIndirectCommandsLayoutTokenNV vertexBindingUnit(@NativeType("uint32_t") int value) { nvertexBindingUnit(address(), value); return this; }
    /** Sets the specified value to the {@code vertexDynamicStride} field. */
    public VkIndirectCommandsLayoutTokenNV vertexDynamicStride(@NativeType("VkBool32") boolean value) { nvertexDynamicStride(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pushconstantPipelineLayout} field. */
    public VkIndirectCommandsLayoutTokenNV pushconstantPipelineLayout(@NativeType("VkPipelineLayout") long value) { npushconstantPipelineLayout(address(), value); return this; }
    /** Sets the specified value to the {@code pushconstantShaderStageFlags} field. */
    public VkIndirectCommandsLayoutTokenNV pushconstantShaderStageFlags(@NativeType("VkShaderStageFlags") int value) { npushconstantShaderStageFlags(address(), value); return this; }
    /** Sets the specified value to the {@code pushconstantOffset} field. */
    public VkIndirectCommandsLayoutTokenNV pushconstantOffset(@NativeType("uint32_t") int value) { npushconstantOffset(address(), value); return this; }
    /** Sets the specified value to the {@code pushconstantSize} field. */
    public VkIndirectCommandsLayoutTokenNV pushconstantSize(@NativeType("uint32_t") int value) { npushconstantSize(address(), value); return this; }
    /** Sets the specified value to the {@code indirectStateFlags} field. */
    public VkIndirectCommandsLayoutTokenNV indirectStateFlags(@NativeType("VkIndirectStateFlagsNV") int value) { nindirectStateFlags(address(), value); return this; }
    /** Sets the specified value to the {@code indexTypeCount} field. */
    public VkIndirectCommandsLayoutTokenNV indexTypeCount(@NativeType("uint32_t") int value) { nindexTypeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pIndexTypes} field. */
    public VkIndirectCommandsLayoutTokenNV pIndexTypes(@Nullable @NativeType("VkIndexType const *") IntBuffer value) { npIndexTypes(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pIndexTypeValues} field. */
    public VkIndirectCommandsLayoutTokenNV pIndexTypeValues(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npIndexTypeValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsLayoutTokenNV set(
        int sType,
        long pNext,
        int tokenType,
        int stream$,
        int offset,
        int vertexBindingUnit,
        boolean vertexDynamicStride,
        long pushconstantPipelineLayout,
        int pushconstantShaderStageFlags,
        int pushconstantOffset,
        int pushconstantSize,
        int indirectStateFlags,
        int indexTypeCount,
        @Nullable IntBuffer pIndexTypes,
        @Nullable IntBuffer pIndexTypeValues
    ) {
        sType(sType);
        pNext(pNext);
        tokenType(tokenType);
        stream$(stream$);
        offset(offset);
        vertexBindingUnit(vertexBindingUnit);
        vertexDynamicStride(vertexDynamicStride);
        pushconstantPipelineLayout(pushconstantPipelineLayout);
        pushconstantShaderStageFlags(pushconstantShaderStageFlags);
        pushconstantOffset(pushconstantOffset);
        pushconstantSize(pushconstantSize);
        indirectStateFlags(indirectStateFlags);
        indexTypeCount(indexTypeCount);
        pIndexTypes(pIndexTypes);
        pIndexTypeValues(pIndexTypeValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsLayoutTokenNV set(VkIndirectCommandsLayoutTokenNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutTokenNV malloc() {
        return new VkIndirectCommandsLayoutTokenNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutTokenNV calloc() {
        return new VkIndirectCommandsLayoutTokenNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsLayoutTokenNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsLayoutTokenNV(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance for the specified memory address. */
    public static VkIndirectCommandsLayoutTokenNV create(long address) {
        return new VkIndirectCommandsLayoutTokenNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsLayoutTokenNV createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsLayoutTokenNV(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsLayoutTokenNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutTokenNV malloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutTokenNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutTokenNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutTokenNV calloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutTokenNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectCommandsLayoutTokenNV.PNEXT); }
    /** Unsafe version of {@link #tokenType}. */
    public static int ntokenType(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNV.TOKENTYPE); }
    /** Unsafe version of {@link #stream$}. */
    public static int nstream$(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNV.STREAM); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNV.OFFSET); }
    /** Unsafe version of {@link #vertexBindingUnit}. */
    public static int nvertexBindingUnit(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNV.VERTEXBINDINGUNIT); }
    /** Unsafe version of {@link #vertexDynamicStride}. */
    public static int nvertexDynamicStride(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNV.VERTEXDYNAMICSTRIDE); }
    /** Unsafe version of {@link #pushconstantPipelineLayout}. */
    public static long npushconstantPipelineLayout(long struct) { return memGetLong(struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTPIPELINELAYOUT); }
    /** Unsafe version of {@link #pushconstantShaderStageFlags}. */
    public static int npushconstantShaderStageFlags(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSHADERSTAGEFLAGS); }
    /** Unsafe version of {@link #pushconstantOffset}. */
    public static int npushconstantOffset(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTOFFSET); }
    /** Unsafe version of {@link #pushconstantSize}. */
    public static int npushconstantSize(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSIZE); }
    /** Unsafe version of {@link #indirectStateFlags}. */
    public static int nindirectStateFlags(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNV.INDIRECTSTATEFLAGS); }
    /** Unsafe version of {@link #indexTypeCount}. */
    public static int nindexTypeCount(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenNV.INDEXTYPECOUNT); }
    /** Unsafe version of {@link #pIndexTypes() pIndexTypes}. */
    public static @Nullable IntBuffer npIndexTypes(long struct) { return memIntBufferSafe(memGetAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPES), nindexTypeCount(struct)); }
    /** Unsafe version of {@link #pIndexTypeValues() pIndexTypeValues}. */
    public static @Nullable IntBuffer npIndexTypeValues(long struct) { return memIntBufferSafe(memGetAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPEVALUES), nindexTypeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectCommandsLayoutTokenNV.PNEXT, value); }
    /** Unsafe version of {@link #tokenType(int) tokenType}. */
    public static void ntokenType(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNV.TOKENTYPE, value); }
    /** Unsafe version of {@link #stream$(int) stream$}. */
    public static void nstream$(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNV.STREAM, value); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNV.OFFSET, value); }
    /** Unsafe version of {@link #vertexBindingUnit(int) vertexBindingUnit}. */
    public static void nvertexBindingUnit(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNV.VERTEXBINDINGUNIT, value); }
    /** Unsafe version of {@link #vertexDynamicStride(boolean) vertexDynamicStride}. */
    public static void nvertexDynamicStride(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNV.VERTEXDYNAMICSTRIDE, value); }
    /** Unsafe version of {@link #pushconstantPipelineLayout(long) pushconstantPipelineLayout}. */
    public static void npushconstantPipelineLayout(long struct, long value) { memPutLong(struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTPIPELINELAYOUT, value); }
    /** Unsafe version of {@link #pushconstantShaderStageFlags(int) pushconstantShaderStageFlags}. */
    public static void npushconstantShaderStageFlags(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSHADERSTAGEFLAGS, value); }
    /** Unsafe version of {@link #pushconstantOffset(int) pushconstantOffset}. */
    public static void npushconstantOffset(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTOFFSET, value); }
    /** Unsafe version of {@link #pushconstantSize(int) pushconstantSize}. */
    public static void npushconstantSize(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSIZE, value); }
    /** Unsafe version of {@link #indirectStateFlags(int) indirectStateFlags}. */
    public static void nindirectStateFlags(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNV.INDIRECTSTATEFLAGS, value); }
    /** Sets the specified value to the {@code indexTypeCount} field of the specified {@code struct}. */
    public static void nindexTypeCount(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenNV.INDEXTYPECOUNT, value); }
    /** Unsafe version of {@link #pIndexTypes(IntBuffer) pIndexTypes}. */
    public static void npIndexTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPES, memAddressSafe(value)); }
    /** Unsafe version of {@link #pIndexTypeValues(IntBuffer) pIndexTypeValues}. */
    public static void npIndexTypeValues(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPEVALUES, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nindexTypeCount(struct) != 0) {
            check(memGetAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPES));
            check(memGetAddress(struct + VkIndirectCommandsLayoutTokenNV.PINDEXTYPEVALUES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsLayoutTokenNV} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutTokenNV, Buffer> implements NativeResource {

        private static final VkIndirectCommandsLayoutTokenNV ELEMENT_FACTORY = VkIndirectCommandsLayoutTokenNV.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsLayoutTokenNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsLayoutTokenNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsLayoutTokenNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectCommandsLayoutTokenNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectCommandsLayoutTokenNV.npNext(address()); }
        /** @return the value of the {@code tokenType} field. */
        @NativeType("VkIndirectCommandsTokenTypeNV")
        public int tokenType() { return VkIndirectCommandsLayoutTokenNV.ntokenType(address()); }
        /** @return the value of the {@code stream} field. */
        @NativeType("uint32_t")
        public int stream$() { return VkIndirectCommandsLayoutTokenNV.nstream$(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("uint32_t")
        public int offset() { return VkIndirectCommandsLayoutTokenNV.noffset(address()); }
        /** @return the value of the {@code vertexBindingUnit} field. */
        @NativeType("uint32_t")
        public int vertexBindingUnit() { return VkIndirectCommandsLayoutTokenNV.nvertexBindingUnit(address()); }
        /** @return the value of the {@code vertexDynamicStride} field. */
        @NativeType("VkBool32")
        public boolean vertexDynamicStride() { return VkIndirectCommandsLayoutTokenNV.nvertexDynamicStride(address()) != 0; }
        /** @return the value of the {@code pushconstantPipelineLayout} field. */
        @NativeType("VkPipelineLayout")
        public long pushconstantPipelineLayout() { return VkIndirectCommandsLayoutTokenNV.npushconstantPipelineLayout(address()); }
        /** @return the value of the {@code pushconstantShaderStageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int pushconstantShaderStageFlags() { return VkIndirectCommandsLayoutTokenNV.npushconstantShaderStageFlags(address()); }
        /** @return the value of the {@code pushconstantOffset} field. */
        @NativeType("uint32_t")
        public int pushconstantOffset() { return VkIndirectCommandsLayoutTokenNV.npushconstantOffset(address()); }
        /** @return the value of the {@code pushconstantSize} field. */
        @NativeType("uint32_t")
        public int pushconstantSize() { return VkIndirectCommandsLayoutTokenNV.npushconstantSize(address()); }
        /** @return the value of the {@code indirectStateFlags} field. */
        @NativeType("VkIndirectStateFlagsNV")
        public int indirectStateFlags() { return VkIndirectCommandsLayoutTokenNV.nindirectStateFlags(address()); }
        /** @return the value of the {@code indexTypeCount} field. */
        @NativeType("uint32_t")
        public int indexTypeCount() { return VkIndirectCommandsLayoutTokenNV.nindexTypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pIndexTypes} field. */
        @NativeType("VkIndexType const *")
        public @Nullable IntBuffer pIndexTypes() { return VkIndirectCommandsLayoutTokenNV.npIndexTypes(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pIndexTypeValues} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pIndexTypeValues() { return VkIndirectCommandsLayoutTokenNV.npIndexTypeValues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectCommandsLayoutTokenNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV} value to the {@code sType} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pNext(@NativeType("void const *") long value) { VkIndirectCommandsLayoutTokenNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tokenType} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer tokenType(@NativeType("VkIndirectCommandsTokenTypeNV") int value) { VkIndirectCommandsLayoutTokenNV.ntokenType(address(), value); return this; }
        /** Sets the specified value to the {@code stream} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer stream$(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.nstream$(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer offset(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code vertexBindingUnit} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer vertexBindingUnit(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.nvertexBindingUnit(address(), value); return this; }
        /** Sets the specified value to the {@code vertexDynamicStride} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer vertexDynamicStride(@NativeType("VkBool32") boolean value) { VkIndirectCommandsLayoutTokenNV.nvertexDynamicStride(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pushconstantPipelineLayout} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pushconstantPipelineLayout(@NativeType("VkPipelineLayout") long value) { VkIndirectCommandsLayoutTokenNV.npushconstantPipelineLayout(address(), value); return this; }
        /** Sets the specified value to the {@code pushconstantShaderStageFlags} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pushconstantShaderStageFlags(@NativeType("VkShaderStageFlags") int value) { VkIndirectCommandsLayoutTokenNV.npushconstantShaderStageFlags(address(), value); return this; }
        /** Sets the specified value to the {@code pushconstantOffset} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pushconstantOffset(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.npushconstantOffset(address(), value); return this; }
        /** Sets the specified value to the {@code pushconstantSize} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pushconstantSize(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.npushconstantSize(address(), value); return this; }
        /** Sets the specified value to the {@code indirectStateFlags} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer indirectStateFlags(@NativeType("VkIndirectStateFlagsNV") int value) { VkIndirectCommandsLayoutTokenNV.nindirectStateFlags(address(), value); return this; }
        /** Sets the specified value to the {@code indexTypeCount} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer indexTypeCount(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenNV.nindexTypeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pIndexTypes} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pIndexTypes(@Nullable @NativeType("VkIndexType const *") IntBuffer value) { VkIndirectCommandsLayoutTokenNV.npIndexTypes(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pIndexTypeValues} field. */
        public VkIndirectCommandsLayoutTokenNV.Buffer pIndexTypeValues(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkIndirectCommandsLayoutTokenNV.npIndexTypeValues(address(), value); return this; }

    }

}