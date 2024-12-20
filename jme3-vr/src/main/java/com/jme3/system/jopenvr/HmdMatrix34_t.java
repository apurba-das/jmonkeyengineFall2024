package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1179</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class HmdMatrix34_t extends Structure {
	/**
	 * float[3][4]<br>
	 * C type : float[3][4]
	 */
	public float[] m = new float[((3) * (4))];
	public HmdMatrix34_t() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("m");
	}
	/**
	 * @param m float[3][4]<br>
	 * C type : float[3][4]
	 */
	public HmdMatrix34_t(float m[]) {
		super();
		if ((m.length != this.m.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.m = m;
	}
	public HmdMatrix34_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends HmdMatrix34_t implements Structure.ByReference {
		
	};
	public static class ByValue extends HmdMatrix34_t implements Structure.ByValue {
		
	};
}
