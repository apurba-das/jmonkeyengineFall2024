package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1473</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class DriverDirectMode_FrameTiming extends Structure {
	public int m_nSize;
	public int m_nNumFramePresents;
	public int m_nNumMisPresented;
	public int m_nNumDroppedFrames;
	public int m_nReprojectionFlags;
	public DriverDirectMode_FrameTiming() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("m_nSize", "m_nNumFramePresents", "m_nNumMisPresented", "m_nNumDroppedFrames", "m_nReprojectionFlags");
	}
	public DriverDirectMode_FrameTiming(int m_nSize, int m_nNumFramePresents, int m_nNumMisPresented, int m_nNumDroppedFrames, int m_nReprojectionFlags) {
		super();
		this.m_nSize = m_nSize;
		this.m_nNumFramePresents = m_nNumFramePresents;
		this.m_nNumMisPresented = m_nNumMisPresented;
		this.m_nNumDroppedFrames = m_nNumDroppedFrames;
		this.m_nReprojectionFlags = m_nReprojectionFlags;
	}
	public DriverDirectMode_FrameTiming(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends DriverDirectMode_FrameTiming implements Structure.ByReference {
		
	};
	public static class ByValue extends DriverDirectMode_FrameTiming implements Structure.ByValue {
		
	};
}
