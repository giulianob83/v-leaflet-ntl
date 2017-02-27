package org.peimari.gleaflet.ntl.client.resources;

import com.google.gwt.core.client.GWT;
import org.peimari.gleaflet.client.resources.LeafletResourceInjector;

public class LeafletNtlResourceInjector {

	protected static LeafletNtlClientBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			LeafletResourceInjector.ensureInjected();
			bundle = GWT.create(LeafletNtlClientBundle.class);
			LeafletNtlResourceInjector injector = GWT
					.create(LeafletNtlResourceInjector.class);
			injector.injectResources();
		}
	}
	
	/**
	 * Override this with deferred binding to customize injected stuff
	 */
	protected void injectResources() {
		injectScript(bundle.heatScript().getText());
		//injectScript(bundle.heatScript2().getText());
	}

	private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

}
