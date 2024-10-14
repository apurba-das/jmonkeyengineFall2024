package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1343</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VREvent_Keyboard_t extends Structure {
	/**
	 * char[8]<br>
	 * C type : char*[8]
	 */
	public Pointer[] cNewInput = new Pointer[8];
	public long uUserValue;
	public VREvent_Keyboard_t() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("cNewInput", "uUserValue");
	}
	/**
	 * @param cNewInput char[8]<br>
	 * C type : char*[8]
	 */
	public VREvent_Keyboard_t(Pointer cNewInput[], long uUserValue) {
		super();
		if ((cNewInput.length != this.cNewInput.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.cNewInput = cNewInput;
		this.uUserValue = uUserValue;
	}
	public VREvent_Keyboard_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VREvent_Keyboard_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VREvent_Keyboard_t implements Structure.ByValue {
		
	};
}
