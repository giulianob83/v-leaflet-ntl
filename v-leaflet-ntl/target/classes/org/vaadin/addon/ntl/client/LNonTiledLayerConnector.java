package org.vaadin.addon.ntl.client;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.peimari.gleaflet.client.AbstractJsonOptions;
import org.peimari.gleaflet.client.Layer;
import org.peimari.gleaflet.ntl.client.NonTiledLayer;
import org.vaadin.addon.leaflet.client.AbstractLeafletLayerConnector;
import org.vaadin.addon.ntl.LNonTiledLayer;

import com.google.gwt.core.client.JsonUtils;
import com.vaadin.shared.ui.Connect;

@Connect(LNonTiledLayer.class)
public class LNonTiledLayerConnector extends AbstractLeafletLayerConnector<AbstractJsonOptions> {
	 private static Logger logger = Logger.getLogger("LNonTiledLayerConnector");
	
	protected Layer layer;
	//static Logger log=Logger.getLogger(LNonTiledLayer.class); 
	

	@Override
	protected AbstractJsonOptions createOptions() {

		return AbstractJsonOptions.createObject().cast();
	}

	

	@Override
	public LNonTiledState getState() {
		return (LNonTiledState) super.getState();
	}

	@Override
	protected void update() {
		// TODO Auto-generated method stub
		logger.log(Level.WARNING,"update connector");
		logger.log(Level.WARNING,"url "+getState().url);
		logger.log(Level.WARNING,"options "+getState().options);
		logger.log(Level.WARNING,"layer"+layer);
		if (layer != null) {
			removeLayerFromParent();
		} else {
			// AbstractJsonOptions options=createOptions();
			
		}
		AbstractJsonOptions options = JsonUtils.safeEval(getState().options);
		logger.log(Level.WARNING,options.toString());
		layer = NonTiledLayer.create(getState().url, options);
		addToParent(layer);

	}

	@Override
	public Layer getLayer() {
		// TODO Auto-generated method stub
		return layer;
	}

}
