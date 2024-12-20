package com.jme3.system.jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:2257</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRNotifications_FnTable extends Structure {
	/** C type : CreateNotification_callback* */
	public VR_IVRNotifications_FnTable.CreateNotification_callback CreateNotification;
	/** C type : RemoveNotification_callback* */
	public VR_IVRNotifications_FnTable.RemoveNotification_callback RemoveNotification;
	/** <i>native declaration : headers\openvr_capi.h:2255</i> */
	public interface CreateNotification_callback extends Callback {
		int apply(long ulOverlayHandle, long ulUserValue, int type, Pointer pchText, int style, NotificationBitmap_t pImage, IntByReference pNotificationId);
	};
	/** <i>native declaration : headers\openvr_capi.h:2256</i> */
	public interface RemoveNotification_callback extends Callback {
		int apply(int notificationId);
	};
	public VR_IVRNotifications_FnTable() {
		super();
	}
        @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("CreateNotification", "RemoveNotification");
	}
	/**
	 * @param CreateNotification C type : CreateNotification_callback*<br>
	 * @param RemoveNotification C type : RemoveNotification_callback*
	 */
	public VR_IVRNotifications_FnTable(VR_IVRNotifications_FnTable.CreateNotification_callback CreateNotification, VR_IVRNotifications_FnTable.RemoveNotification_callback RemoveNotification) {
		super();
		this.CreateNotification = CreateNotification;
		this.RemoveNotification = RemoveNotification;
	}
	public VR_IVRNotifications_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRNotifications_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRNotifications_FnTable implements Structure.ByValue {
		
	};
}
