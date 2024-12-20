package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1528</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class Compositor_CumulativeStats extends Structure {
	public int m_nPid;
	public int m_nNumFramePresents;
	public int m_nNumDroppedFrames;
	public int m_nNumReprojectedFrames;
	public int m_nNumFramePresentsOnStartup;
	public int m_nNumDroppedFramesOnStartup;
	public int m_nNumReprojectedFramesOnStartup;
	public int m_nNumLoading;
	public int m_nNumFramePresentsLoading;
	public int m_nNumDroppedFramesLoading;
	public int m_nNumReprojectedFramesLoading;
	public int m_nNumTimedOut;
	public int m_nNumFramePresentsTimedOut;
	public int m_nNumDroppedFramesTimedOut;
	public int m_nNumReprojectedFramesTimedOut;
	public Compositor_CumulativeStats() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("m_nPid", "m_nNumFramePresents", "m_nNumDroppedFrames", "m_nNumReprojectedFrames", "m_nNumFramePresentsOnStartup", "m_nNumDroppedFramesOnStartup", "m_nNumReprojectedFramesOnStartup", "m_nNumLoading", "m_nNumFramePresentsLoading", "m_nNumDroppedFramesLoading", "m_nNumReprojectedFramesLoading", "m_nNumTimedOut", "m_nNumFramePresentsTimedOut", "m_nNumDroppedFramesTimedOut", "m_nNumReprojectedFramesTimedOut");
	}
	public Compositor_CumulativeStats(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends Compositor_CumulativeStats implements Structure.ByReference {
		
	};
	public static class ByValue extends Compositor_CumulativeStats implements Structure.ByValue {
		
	};
}
