package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1620</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class InputSkeletalActionData_t extends Structure {
	public byte bActive;
	/** C type : VRInputValueHandle_t */
	public long activeOrigin;
	public int boneCount;
	public InputSkeletalActionData_t() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("bActive", "activeOrigin", "boneCount");
	}
	/** @param activeOrigin C type : VRInputValueHandle_t */
	public InputSkeletalActionData_t(byte bActive, long activeOrigin, int boneCount) {
		super();
		this.bActive = bActive;
		this.activeOrigin = activeOrigin;
		this.boneCount = boneCount;
	}
	public InputSkeletalActionData_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends InputSkeletalActionData_t implements Structure.ByReference {
		
	};
	public static class ByValue extends InputSkeletalActionData_t implements Structure.ByValue {
		
	};
}