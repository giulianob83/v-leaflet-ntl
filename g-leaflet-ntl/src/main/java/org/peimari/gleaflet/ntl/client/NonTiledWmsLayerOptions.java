package org.peimari.gleaflet.ntl.client;

import org.peimari.gleaflet.client.AbstractJsonOptions;
import org.peimari.gleaflet.client.Crs;

public class NonTiledWmsLayerOptions extends AbstractJsonOptions {

protected NonTiledWmsLayerOptions() {}
	
	public static native NonTiledWmsLayerOptions create() 
	/*-{
		return {};
	}-*/;

	public native final void setLayers(String layers) 
	/*-{
		this.layers = layers;
	}-*/;

	public native final void setStyles(String styles) 
	/*-{
		this.styles = styles;
	}-*/;

	public native final void setFormat(String format) 
	/*-{
		this.format = format;
	}-*/;

	public native final void setTransparent(boolean transparent) 
	/*-{
		this.transparent = transparent;
	}-*/;

	public native final void setVersion(String version) 
	/*-{
		this.version = version;
	}-*/;

    public native final void setCrs(Crs crs)
	/*-{
        this.crs = crs;
    }-*/;
    
    	public native final void setViewparams(String viewparams)
    	/*-{
		this.viewparams = viewparams;
	}-*/;

}
