package org.vaadin.addon.ntl.client;

import org.peimari.gleaflet.client.AbstractJsonOptions;
import org.peimari.gleaflet.client.Layer;
import org.peimari.gleaflet.ntl.client.NonTiledLayer;
import org.slf4j.Logger;
import org.vaadin.addon.leaflet.client.AbstractLeafletLayerConnector;
import org.vaadin.addon.ntl.LNonTiledLayer;

import com.google.gwt.core.client.JsonUtils;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.shared.ui.Connect;

@Connect(LNonTiledLayer.class)
public class LNonTiledLayerConnector extends
        AbstractLeafletLayerConnector<AbstractJsonOptions> {

	private Layer layer;
	
	public LNonTiledLayerConnector() {
    }
	
	

	
	@Override
	protected AbstractJsonOptions createOptions() {
	
		return AbstractJsonOptions.createObject().cast();
	}
	
	@Override
    public void onStateChanged(StateChangeEvent stateChangeEvent)
    {
        super.onStateChanged(stateChangeEvent);

        // Do something useful
       
    }

	@Override
	public LNonTiledState getState() {
		return (LNonTiledState) super.getState();
	}

	@Override
	protected void update() {
		// TODO Auto-generated method stub
		if (layer != null) {
			removeLayerFromParent();
		}
		//AbstractJsonOptions options=createOptions();
		AbstractJsonOptions options = JsonUtils.safeEval(getState().options);
		layer = NonTiledLayer.create(getState().url,options);
		addToParent(layer);

	}

	@Override
	public Layer getLayer() {
		// TODO Auto-generated method stub
		return layer;
	}

}
