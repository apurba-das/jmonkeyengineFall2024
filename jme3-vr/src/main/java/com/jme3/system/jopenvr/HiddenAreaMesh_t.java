package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1425</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class HiddenAreaMesh_t extends Structure {
	/**
	 * const struct vr::HmdVector2_t *<br>
	 * C type : HmdVector2_t*
	 */
	public com.jme3.system.jopenvr.HmdVector2_t.ByReference pVertexData;
	public int unTriangleCount;
	public HiddenAreaMesh_t() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("pVertexData", "unTriangleCount");
	}
	/**
	 * @param pVertexData const struct vr::HmdVector2_t *<br>
	 * C type : HmdVector2_t*
	 */
	public HiddenAreaMesh_t(com.jme3.system.jopenvr.HmdVector2_t.ByReference pVertexData, int unTriangleCount) {
		super();
		this.pVertexData = pVertexData;
		this.unTriangleCount = unTriangleCount;
	}
	public HiddenAreaMesh_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends HiddenAreaMesh_t implements Structure.ByReference {
		
	};
	public static class ByValue extends HiddenAreaMesh_t implements Structure.ByValue {
		
	};
}
