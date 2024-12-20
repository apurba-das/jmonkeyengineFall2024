package com.jme3.system.jopenvr;
import com.jme3.system.jopenvr.JOpenVRLibrary.VkDevice_T;
import com.jme3.system.jopenvr.JOpenVRLibrary.VkInstance_T;
import com.jme3.system.jopenvr.JOpenVRLibrary.VkPhysicalDevice_T;
import com.jme3.system.jopenvr.JOpenVRLibrary.VkQueue_T;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1294</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VRVulkanTextureData_t extends Structure {
	public long m_nImage;
	/**
	 * struct VkDevice_T *<br>
	 * C type : VkDevice_T*
	 */
	public VkDevice_T m_pDevice;
	/**
	 * struct VkPhysicalDevice_T *<br>
	 * C type : VkPhysicalDevice_T*
	 */
	public VkPhysicalDevice_T m_pPhysicalDevice;
	/**
	 * struct VkInstance_T *<br>
	 * C type : VkInstance_T*
	 */
	public VkInstance_T m_pInstance;
	/**
	 * struct VkQueue_T *<br>
	 * C type : VkQueue_T*
	 */
	public VkQueue_T m_pQueue;
	public int m_nQueueFamilyIndex;
	public int m_nWidth;
	public int m_nHeight;
	public int m_nFormat;
	public int m_nSampleCount;
	public VRVulkanTextureData_t() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("m_nImage", "m_pDevice", "m_pPhysicalDevice", "m_pInstance", "m_pQueue", "m_nQueueFamilyIndex", "m_nWidth", "m_nHeight", "m_nFormat", "m_nSampleCount");
	}
	public VRVulkanTextureData_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VRVulkanTextureData_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VRVulkanTextureData_t implements Structure.ByValue {
		
	};
}
