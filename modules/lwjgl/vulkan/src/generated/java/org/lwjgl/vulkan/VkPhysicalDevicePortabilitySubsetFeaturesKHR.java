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
 * struct VkPhysicalDevicePortabilitySubsetFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 constantAlphaColorBlendFactors;
 *     VkBool32 events;
 *     VkBool32 imageViewFormatReinterpretation;
 *     VkBool32 imageViewFormatSwizzle;
 *     VkBool32 imageView2DOn3DImage;
 *     VkBool32 multisampleArrayImage;
 *     VkBool32 mutableComparisonSamplers;
 *     VkBool32 pointPolygons;
 *     VkBool32 samplerMipLodBias;
 *     VkBool32 separateStencilMaskRef;
 *     VkBool32 shaderSampleRateInterpolationFunctions;
 *     VkBool32 tessellationIsolines;
 *     VkBool32 tessellationPointMode;
 *     VkBool32 triangleFans;
 *     VkBool32 vertexAttributeAccessBeyondStride;
 * }}</pre>
 */
public class VkPhysicalDevicePortabilitySubsetFeaturesKHR extends Struct<VkPhysicalDevicePortabilitySubsetFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CONSTANTALPHACOLORBLENDFACTORS,
        EVENTS,
        IMAGEVIEWFORMATREINTERPRETATION,
        IMAGEVIEWFORMATSWIZZLE,
        IMAGEVIEW2DON3DIMAGE,
        MULTISAMPLEARRAYIMAGE,
        MUTABLECOMPARISONSAMPLERS,
        POINTPOLYGONS,
        SAMPLERMIPLODBIAS,
        SEPARATESTENCILMASKREF,
        SHADERSAMPLERATEINTERPOLATIONFUNCTIONS,
        TESSELLATIONISOLINES,
        TESSELLATIONPOINTMODE,
        TRIANGLEFANS,
        VERTEXATTRIBUTEACCESSBEYONDSTRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONSTANTALPHACOLORBLENDFACTORS = layout.offsetof(2);
        EVENTS = layout.offsetof(3);
        IMAGEVIEWFORMATREINTERPRETATION = layout.offsetof(4);
        IMAGEVIEWFORMATSWIZZLE = layout.offsetof(5);
        IMAGEVIEW2DON3DIMAGE = layout.offsetof(6);
        MULTISAMPLEARRAYIMAGE = layout.offsetof(7);
        MUTABLECOMPARISONSAMPLERS = layout.offsetof(8);
        POINTPOLYGONS = layout.offsetof(9);
        SAMPLERMIPLODBIAS = layout.offsetof(10);
        SEPARATESTENCILMASKREF = layout.offsetof(11);
        SHADERSAMPLERATEINTERPOLATIONFUNCTIONS = layout.offsetof(12);
        TESSELLATIONISOLINES = layout.offsetof(13);
        TESSELLATIONPOINTMODE = layout.offsetof(14);
        TRIANGLEFANS = layout.offsetof(15);
        VERTEXATTRIBUTEACCESSBEYONDSTRIDE = layout.offsetof(16);
    }

    protected VkPhysicalDevicePortabilitySubsetFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePortabilitySubsetFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePortabilitySubsetFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code constantAlphaColorBlendFactors} field. */
    @NativeType("VkBool32")
    public boolean constantAlphaColorBlendFactors() { return nconstantAlphaColorBlendFactors(address()) != 0; }
    /** @return the value of the {@code events} field. */
    @NativeType("VkBool32")
    public boolean events() { return nevents(address()) != 0; }
    /** @return the value of the {@code imageViewFormatReinterpretation} field. */
    @NativeType("VkBool32")
    public boolean imageViewFormatReinterpretation() { return nimageViewFormatReinterpretation(address()) != 0; }
    /** @return the value of the {@code imageViewFormatSwizzle} field. */
    @NativeType("VkBool32")
    public boolean imageViewFormatSwizzle() { return nimageViewFormatSwizzle(address()) != 0; }
    /** @return the value of the {@code imageView2DOn3DImage} field. */
    @NativeType("VkBool32")
    public boolean imageView2DOn3DImage() { return nimageView2DOn3DImage(address()) != 0; }
    /** @return the value of the {@code multisampleArrayImage} field. */
    @NativeType("VkBool32")
    public boolean multisampleArrayImage() { return nmultisampleArrayImage(address()) != 0; }
    /** @return the value of the {@code mutableComparisonSamplers} field. */
    @NativeType("VkBool32")
    public boolean mutableComparisonSamplers() { return nmutableComparisonSamplers(address()) != 0; }
    /** @return the value of the {@code pointPolygons} field. */
    @NativeType("VkBool32")
    public boolean pointPolygons() { return npointPolygons(address()) != 0; }
    /** @return the value of the {@code samplerMipLodBias} field. */
    @NativeType("VkBool32")
    public boolean samplerMipLodBias() { return nsamplerMipLodBias(address()) != 0; }
    /** @return the value of the {@code separateStencilMaskRef} field. */
    @NativeType("VkBool32")
    public boolean separateStencilMaskRef() { return nseparateStencilMaskRef(address()) != 0; }
    /** @return the value of the {@code shaderSampleRateInterpolationFunctions} field. */
    @NativeType("VkBool32")
    public boolean shaderSampleRateInterpolationFunctions() { return nshaderSampleRateInterpolationFunctions(address()) != 0; }
    /** @return the value of the {@code tessellationIsolines} field. */
    @NativeType("VkBool32")
    public boolean tessellationIsolines() { return ntessellationIsolines(address()) != 0; }
    /** @return the value of the {@code tessellationPointMode} field. */
    @NativeType("VkBool32")
    public boolean tessellationPointMode() { return ntessellationPointMode(address()) != 0; }
    /** @return the value of the {@code triangleFans} field. */
    @NativeType("VkBool32")
    public boolean triangleFans() { return ntriangleFans(address()) != 0; }
    /** @return the value of the {@code vertexAttributeAccessBeyondStride} field. */
    @NativeType("VkBool32")
    public boolean vertexAttributeAccessBeyondStride() { return nvertexAttributeAccessBeyondStride(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPortabilitySubset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR sType$Default() { return sType(KHRPortabilitySubset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code constantAlphaColorBlendFactors} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR constantAlphaColorBlendFactors(@NativeType("VkBool32") boolean value) { nconstantAlphaColorBlendFactors(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code events} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR events(@NativeType("VkBool32") boolean value) { nevents(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code imageViewFormatReinterpretation} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatReinterpretation(@NativeType("VkBool32") boolean value) { nimageViewFormatReinterpretation(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code imageViewFormatSwizzle} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatSwizzle(@NativeType("VkBool32") boolean value) { nimageViewFormatSwizzle(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code imageView2DOn3DImage} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageView2DOn3DImage(@NativeType("VkBool32") boolean value) { nimageView2DOn3DImage(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multisampleArrayImage} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR multisampleArrayImage(@NativeType("VkBool32") boolean value) { nmultisampleArrayImage(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code mutableComparisonSamplers} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR mutableComparisonSamplers(@NativeType("VkBool32") boolean value) { nmutableComparisonSamplers(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pointPolygons} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pointPolygons(@NativeType("VkBool32") boolean value) { npointPolygons(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code samplerMipLodBias} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR samplerMipLodBias(@NativeType("VkBool32") boolean value) { nsamplerMipLodBias(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code separateStencilMaskRef} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR separateStencilMaskRef(@NativeType("VkBool32") boolean value) { nseparateStencilMaskRef(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSampleRateInterpolationFunctions} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR shaderSampleRateInterpolationFunctions(@NativeType("VkBool32") boolean value) { nshaderSampleRateInterpolationFunctions(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tessellationIsolines} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationIsolines(@NativeType("VkBool32") boolean value) { ntessellationIsolines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tessellationPointMode} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationPointMode(@NativeType("VkBool32") boolean value) { ntessellationPointMode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code triangleFans} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR triangleFans(@NativeType("VkBool32") boolean value) { ntriangleFans(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vertexAttributeAccessBeyondStride} field. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR vertexAttributeAccessBeyondStride(@NativeType("VkBool32") boolean value) { nvertexAttributeAccessBeyondStride(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR set(
        int sType,
        long pNext,
        boolean constantAlphaColorBlendFactors,
        boolean events,
        boolean imageViewFormatReinterpretation,
        boolean imageViewFormatSwizzle,
        boolean imageView2DOn3DImage,
        boolean multisampleArrayImage,
        boolean mutableComparisonSamplers,
        boolean pointPolygons,
        boolean samplerMipLodBias,
        boolean separateStencilMaskRef,
        boolean shaderSampleRateInterpolationFunctions,
        boolean tessellationIsolines,
        boolean tessellationPointMode,
        boolean triangleFans,
        boolean vertexAttributeAccessBeyondStride
    ) {
        sType(sType);
        pNext(pNext);
        constantAlphaColorBlendFactors(constantAlphaColorBlendFactors);
        events(events);
        imageViewFormatReinterpretation(imageViewFormatReinterpretation);
        imageViewFormatSwizzle(imageViewFormatSwizzle);
        imageView2DOn3DImage(imageView2DOn3DImage);
        multisampleArrayImage(multisampleArrayImage);
        mutableComparisonSamplers(mutableComparisonSamplers);
        pointPolygons(pointPolygons);
        samplerMipLodBias(samplerMipLodBias);
        separateStencilMaskRef(separateStencilMaskRef);
        shaderSampleRateInterpolationFunctions(shaderSampleRateInterpolationFunctions);
        tessellationIsolines(tessellationIsolines);
        tessellationPointMode(tessellationPointMode);
        triangleFans(triangleFans);
        vertexAttributeAccessBeyondStride(vertexAttributeAccessBeyondStride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR set(VkPhysicalDevicePortabilitySubsetFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePortabilitySubsetFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR malloc() {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePortabilitySubsetFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR calloc() {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePortabilitySubsetFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePortabilitySubsetFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR create(long address) {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePortabilitySubsetFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePortabilitySubsetFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePortabilitySubsetFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePortabilitySubsetFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #constantAlphaColorBlendFactors}. */
    public static int nconstantAlphaColorBlendFactors(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.CONSTANTALPHACOLORBLENDFACTORS); }
    /** Unsafe version of {@link #events}. */
    public static int nevents(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.EVENTS); }
    /** Unsafe version of {@link #imageViewFormatReinterpretation}. */
    public static int nimageViewFormatReinterpretation(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEWFORMATREINTERPRETATION); }
    /** Unsafe version of {@link #imageViewFormatSwizzle}. */
    public static int nimageViewFormatSwizzle(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEWFORMATSWIZZLE); }
    /** Unsafe version of {@link #imageView2DOn3DImage}. */
    public static int nimageView2DOn3DImage(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEW2DON3DIMAGE); }
    /** Unsafe version of {@link #multisampleArrayImage}. */
    public static int nmultisampleArrayImage(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.MULTISAMPLEARRAYIMAGE); }
    /** Unsafe version of {@link #mutableComparisonSamplers}. */
    public static int nmutableComparisonSamplers(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.MUTABLECOMPARISONSAMPLERS); }
    /** Unsafe version of {@link #pointPolygons}. */
    public static int npointPolygons(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.POINTPOLYGONS); }
    /** Unsafe version of {@link #samplerMipLodBias}. */
    public static int nsamplerMipLodBias(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.SAMPLERMIPLODBIAS); }
    /** Unsafe version of {@link #separateStencilMaskRef}. */
    public static int nseparateStencilMaskRef(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.SEPARATESTENCILMASKREF); }
    /** Unsafe version of {@link #shaderSampleRateInterpolationFunctions}. */
    public static int nshaderSampleRateInterpolationFunctions(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.SHADERSAMPLERATEINTERPOLATIONFUNCTIONS); }
    /** Unsafe version of {@link #tessellationIsolines}. */
    public static int ntessellationIsolines(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.TESSELLATIONISOLINES); }
    /** Unsafe version of {@link #tessellationPointMode}. */
    public static int ntessellationPointMode(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.TESSELLATIONPOINTMODE); }
    /** Unsafe version of {@link #triangleFans}. */
    public static int ntriangleFans(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.TRIANGLEFANS); }
    /** Unsafe version of {@link #vertexAttributeAccessBeyondStride}. */
    public static int nvertexAttributeAccessBeyondStride(long struct) { return memGetInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.VERTEXATTRIBUTEACCESSBEYONDSTRIDE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #constantAlphaColorBlendFactors(boolean) constantAlphaColorBlendFactors}. */
    public static void nconstantAlphaColorBlendFactors(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.CONSTANTALPHACOLORBLENDFACTORS, value); }
    /** Unsafe version of {@link #events(boolean) events}. */
    public static void nevents(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.EVENTS, value); }
    /** Unsafe version of {@link #imageViewFormatReinterpretation(boolean) imageViewFormatReinterpretation}. */
    public static void nimageViewFormatReinterpretation(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEWFORMATREINTERPRETATION, value); }
    /** Unsafe version of {@link #imageViewFormatSwizzle(boolean) imageViewFormatSwizzle}. */
    public static void nimageViewFormatSwizzle(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEWFORMATSWIZZLE, value); }
    /** Unsafe version of {@link #imageView2DOn3DImage(boolean) imageView2DOn3DImage}. */
    public static void nimageView2DOn3DImage(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.IMAGEVIEW2DON3DIMAGE, value); }
    /** Unsafe version of {@link #multisampleArrayImage(boolean) multisampleArrayImage}. */
    public static void nmultisampleArrayImage(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.MULTISAMPLEARRAYIMAGE, value); }
    /** Unsafe version of {@link #mutableComparisonSamplers(boolean) mutableComparisonSamplers}. */
    public static void nmutableComparisonSamplers(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.MUTABLECOMPARISONSAMPLERS, value); }
    /** Unsafe version of {@link #pointPolygons(boolean) pointPolygons}. */
    public static void npointPolygons(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.POINTPOLYGONS, value); }
    /** Unsafe version of {@link #samplerMipLodBias(boolean) samplerMipLodBias}. */
    public static void nsamplerMipLodBias(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.SAMPLERMIPLODBIAS, value); }
    /** Unsafe version of {@link #separateStencilMaskRef(boolean) separateStencilMaskRef}. */
    public static void nseparateStencilMaskRef(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.SEPARATESTENCILMASKREF, value); }
    /** Unsafe version of {@link #shaderSampleRateInterpolationFunctions(boolean) shaderSampleRateInterpolationFunctions}. */
    public static void nshaderSampleRateInterpolationFunctions(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.SHADERSAMPLERATEINTERPOLATIONFUNCTIONS, value); }
    /** Unsafe version of {@link #tessellationIsolines(boolean) tessellationIsolines}. */
    public static void ntessellationIsolines(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.TESSELLATIONISOLINES, value); }
    /** Unsafe version of {@link #tessellationPointMode(boolean) tessellationPointMode}. */
    public static void ntessellationPointMode(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.TESSELLATIONPOINTMODE, value); }
    /** Unsafe version of {@link #triangleFans(boolean) triangleFans}. */
    public static void ntriangleFans(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.TRIANGLEFANS, value); }
    /** Unsafe version of {@link #vertexAttributeAccessBeyondStride(boolean) vertexAttributeAccessBeyondStride}. */
    public static void nvertexAttributeAccessBeyondStride(long struct, int value) { memPutInt(struct + VkPhysicalDevicePortabilitySubsetFeaturesKHR.VERTEXATTRIBUTEACCESSBEYONDSTRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePortabilitySubsetFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePortabilitySubsetFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePortabilitySubsetFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePortabilitySubsetFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code constantAlphaColorBlendFactors} field. */
        @NativeType("VkBool32")
        public boolean constantAlphaColorBlendFactors() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nconstantAlphaColorBlendFactors(address()) != 0; }
        /** @return the value of the {@code events} field. */
        @NativeType("VkBool32")
        public boolean events() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nevents(address()) != 0; }
        /** @return the value of the {@code imageViewFormatReinterpretation} field. */
        @NativeType("VkBool32")
        public boolean imageViewFormatReinterpretation() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatReinterpretation(address()) != 0; }
        /** @return the value of the {@code imageViewFormatSwizzle} field. */
        @NativeType("VkBool32")
        public boolean imageViewFormatSwizzle() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatSwizzle(address()) != 0; }
        /** @return the value of the {@code imageView2DOn3DImage} field. */
        @NativeType("VkBool32")
        public boolean imageView2DOn3DImage() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageView2DOn3DImage(address()) != 0; }
        /** @return the value of the {@code multisampleArrayImage} field. */
        @NativeType("VkBool32")
        public boolean multisampleArrayImage() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmultisampleArrayImage(address()) != 0; }
        /** @return the value of the {@code mutableComparisonSamplers} field. */
        @NativeType("VkBool32")
        public boolean mutableComparisonSamplers() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmutableComparisonSamplers(address()) != 0; }
        /** @return the value of the {@code pointPolygons} field. */
        @NativeType("VkBool32")
        public boolean pointPolygons() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.npointPolygons(address()) != 0; }
        /** @return the value of the {@code samplerMipLodBias} field. */
        @NativeType("VkBool32")
        public boolean samplerMipLodBias() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsamplerMipLodBias(address()) != 0; }
        /** @return the value of the {@code separateStencilMaskRef} field. */
        @NativeType("VkBool32")
        public boolean separateStencilMaskRef() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nseparateStencilMaskRef(address()) != 0; }
        /** @return the value of the {@code shaderSampleRateInterpolationFunctions} field. */
        @NativeType("VkBool32")
        public boolean shaderSampleRateInterpolationFunctions() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nshaderSampleRateInterpolationFunctions(address()) != 0; }
        /** @return the value of the {@code tessellationIsolines} field. */
        @NativeType("VkBool32")
        public boolean tessellationIsolines() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationIsolines(address()) != 0; }
        /** @return the value of the {@code tessellationPointMode} field. */
        @NativeType("VkBool32")
        public boolean tessellationPointMode() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationPointMode(address()) != 0; }
        /** @return the value of the {@code triangleFans} field. */
        @NativeType("VkBool32")
        public boolean triangleFans() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntriangleFans(address()) != 0; }
        /** @return the value of the {@code vertexAttributeAccessBeyondStride} field. */
        @NativeType("VkBool32")
        public boolean vertexAttributeAccessBeyondStride() { return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nvertexAttributeAccessBeyondStride(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPortabilitySubset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer sType$Default() { return sType(KHRPortabilitySubset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code constantAlphaColorBlendFactors} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer constantAlphaColorBlendFactors(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nconstantAlphaColorBlendFactors(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code events} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer events(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nevents(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code imageViewFormatReinterpretation} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer imageViewFormatReinterpretation(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatReinterpretation(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code imageViewFormatSwizzle} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer imageViewFormatSwizzle(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatSwizzle(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code imageView2DOn3DImage} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer imageView2DOn3DImage(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageView2DOn3DImage(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multisampleArrayImage} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer multisampleArrayImage(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmultisampleArrayImage(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code mutableComparisonSamplers} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer mutableComparisonSamplers(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmutableComparisonSamplers(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pointPolygons} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer pointPolygons(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.npointPolygons(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code samplerMipLodBias} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer samplerMipLodBias(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsamplerMipLodBias(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code separateStencilMaskRef} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer separateStencilMaskRef(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nseparateStencilMaskRef(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSampleRateInterpolationFunctions} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer shaderSampleRateInterpolationFunctions(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nshaderSampleRateInterpolationFunctions(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tessellationIsolines} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer tessellationIsolines(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationIsolines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tessellationPointMode} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer tessellationPointMode(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationPointMode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code triangleFans} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer triangleFans(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntriangleFans(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vertexAttributeAccessBeyondStride} field. */
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR.Buffer vertexAttributeAccessBeyondStride(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePortabilitySubsetFeaturesKHR.nvertexAttributeAccessBeyondStride(address(), value ? 1 : 0); return this; }

    }

}