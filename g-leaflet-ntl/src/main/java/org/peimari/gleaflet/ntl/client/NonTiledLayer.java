package org.peimari.gleaflet.ntl.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.peimari.gleaflet.client.Layer;
import org.peimari.gleaflet.client.LatLng;

public class NonTiledLayer extends Layer {


	public static final native NonTiledLayer create(String url, JavaScriptObject options) 
	/*-{
		return $wnd.L.NonTiledLayer.WMS(url,options);
	}-*/;
	
	
	
	

}
