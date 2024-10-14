package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.ShortByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1578</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class RenderModel_t extends Structure {
	/**
	 * const struct vr::RenderModel_Vertex_t *<br>
	 * C type : RenderModel_Vertex_t*
	 */
	public com.jme3.system.jopenvr.RenderModel_Vertex_t.ByReference rVertexData;
	public int unVertexCount;
	/**
	 * const uint16_t *<br>
	 * C type : uint16_t*
	 */
	public ShortByReference rIndexData;
	public int unTriangleCount;
	/** C type : TextureID_t */
	public int diffuseTextureId;
	public RenderModel_t() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("rVertexData", "unVertexCount", "rIndexData", "unTriangleCount", "diffuseTextureId");
	}
	/**
	 * @param rVertexData const struct vr::RenderModel_Vertex_t *<br>
	 * C type : RenderModel_Vertex_t*<br>
	 * @param rIndexData const uint16_t *<br>
	 * C type : uint16_t*<br>
	 * @param diffuseTextureId C type : TextureID_t
	 */
	public RenderModel_t(com.jme3.system.jopenvr.RenderModel_Vertex_t.ByReference rVertexData, int unVertexCount, ShortByReference rIndexData, int unTriangleCount, int diffuseTextureId) {
		super();
		this.rVertexData = rVertexData;
		this.unVertexCount = unVertexCount;
		this.rIndexData = rIndexData;
		this.unTriangleCount = unTriangleCount;
		this.diffuseTextureId = diffuseTextureId;
	}
	public RenderModel_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends RenderModel_t implements Structure.ByReference {
		
	};
	public static class ByValue extends RenderModel_t implements Structure.ByValue {
		
	};
}