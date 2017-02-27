package org.vaadin.addon.ntl.client;


import org.peimari.gleaflet.ntl.client.resources.LeafletNtlResourceInjector;

import com.google.gwt.core.client.EntryPoint;

public class EagerNtlLoader implements EntryPoint {

	@Override
	public void onModuleLoad() {
		LeafletNtlResourceInjector.ensureInjected();
	}

}
