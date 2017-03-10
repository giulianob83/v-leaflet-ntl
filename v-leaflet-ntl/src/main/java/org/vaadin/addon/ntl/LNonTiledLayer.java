package org.vaadin.addon.ntl;

import org.vaadin.addon.leaflet.AbstractLeafletLayer;
import org.vaadin.addon.leaflet.jsonmodels.BasicMap;
import org.vaadin.addon.leaflet.shared.Crs;
import org.vaadin.addon.ntl.client.LNonTiledState;

import com.vividsolutions.jts.geom.Geometry;

public class LNonTiledLayer extends AbstractLeafletLayer {
    private Crs lCrs;
    private final BasicMap options = new BasicMap();
    private String url;
    
	@Override
	protected LNonTiledState getState() {
		return (LNonTiledState) super.getState();
		
	}
	
	
	
	@Override
    public void beforeClientResponse(boolean initial) {
        
        
        getState().url = url;
        getState().options = options.asJson();
        super.beforeClientResponse(initial);
    }

	
	
	
	 public String getUrl() {
	        return getState().url;
	    }

	    public void setUrl(String url) {
	    	getState().url=url;
	    	this.url=url;
	        markAsDirty();
	    }
		
	    
	    
		public Integer getMinZoom() {
			return (Integer) options.get("minZoom");
	        
	    }

	    public void setPane(String pane) {
	    	options.put("pane", pane);
	    	markAsDirty();
	        
	    }
	    
	    public String getPane() {
	    	return (String) options.get("pane");
	        
	    }
	    
	    public void setMinZoom(Integer minZoom) {
	    	options.put("minZoom", minZoom);
	        
	    }

	    public Integer getMaxZoom() {
	    	return (Integer) options.get("maxZoom");
	        
	    }

	    public void setMaxZoom(Integer maxZoom) {
	    	options.put("maxZoom", maxZoom);
	        
	    }
		
	

	public String getLayers() {
		//return getState().layers;
		return (String) options.get("layers");
	}

	public void setLayers(String layers) {
		options.put("layers", layers);
		markAsDirty();
		//getState().options = options.asJson();
	}

	public String getStyles() {
		//return getState().layerStyles;
		return "";
	}

	public void setStyles(String styles) {
		//getState().layerStyles = styles;
	}

	public String getFormat() {
		return (String) options.get("format");
	}

	public void setFormat(String format) {
		options.put("format", format);
		markAsDirty();
	}

	public Boolean getTransparent() {
		return Boolean.getBoolean((String)options.get("transparent"));
	}

	public void setTransparent(Boolean transparent) {
		options.put("transparent", transparent);
		markAsDirty();
		
	}

	public String getVersion() {
		return (String) options.get("version");
		
	}

	public void setVersion(String version) {
		options.put("version", version);
		markAsDirty();
	}
	

	public void setOpacity(double opacity) {
		// TODO Auto-generated method stub
		options.put("opacity", opacity);
		markAsDirty();
	}
	
	 public void setZindex(int zIndex) {
	        options.put("zIndex", zIndex);
	        markAsDirty();
	    }
	 
	 public Integer getZindex() {
		 return (Integer) options.get("zIndex");
	 }
	
	public double getOpacity(){
		return (Double) options.get("opacity");
		
	}

    public Crs getCrs() {
        return lCrs;
    }

   

	@Override
	public Geometry getGeometry() {
		// TODO Auto-generated method stub
		return null;
	}

}
