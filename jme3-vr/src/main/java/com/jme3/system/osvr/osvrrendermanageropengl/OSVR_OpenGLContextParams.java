package com.jme3.system.osvr.osvrrendermanageropengl;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OSVR_OpenGLContextParams extends Structure {
	/** C type : const char* */
	public Pointer windowTitle;
	/** C type : OSVR_CBool */
	public byte fullScreen;
	public int width;
	public int height;
	public int xPos;
	public int yPos;
	public int bitsPerPixel;
	public int numBuffers;
	/** C type : OSVR_CBool */
	public byte visible;
	public OSVR_OpenGLContextParams() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("windowTitle", "fullScreen", "width", "height", "xPos", "yPos", "bitsPerPixel", "numBuffers", "visible");
	}
	/**
	 * @param windowTitle C type : const char*<br>
	 * @param fullScreen C type : OSVR_CBool<br>
	 * @param visible C type : OSVR_CBool
	 */
	public OSVR_OpenGLContextParams(Pointer windowTitle, byte fullScreen, int width, int height, int xPos, int yPos, int bitsPerPixel, int numBuffers, byte visible) {
		super();
		this.windowTitle = windowTitle;
		this.fullScreen = fullScreen;
		this.width = width;
		this.height = height;
		this.xPos = xPos;
		this.yPos = yPos;
		this.bitsPerPixel = bitsPerPixel;
		this.numBuffers = numBuffers;
		this.visible = visible;
	}
	public OSVR_OpenGLContextParams(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OSVR_OpenGLContextParams implements Structure.ByReference {
		
	};
	public static class ByValue extends OSVR_OpenGLContextParams implements Structure.ByValue {
		
	};
}
