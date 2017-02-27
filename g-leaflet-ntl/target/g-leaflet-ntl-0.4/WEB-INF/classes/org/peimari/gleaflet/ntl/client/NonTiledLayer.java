package org.peimari.gleaflet.ntl.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.peimari.gleaflet.client.Layer;
import org.peimari.gleaflet.client.LatLng;

public class NonTiledLayer extends Layer {

	protected NonTiledLayer() {
	}

	public static final native NonTiledLayer create(String url, JavaScriptObject options) 
	/*-{
		return $wnd.L.NonTiledLayer.WMS(url,options);
	}-*/;
	
	public static final native NonTiledLayer create()
		/*-{
		return $wnd.L.NonTiledLayer.WMS('http://rdsi.regione.basilicata.it/geoserver/wms', {layers:'topp:com_basilicata_2011_utm33', format: 'image/png'});
	}-*/;
	
	

}
