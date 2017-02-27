package org.vaadin.addon.leaflet.demoandtestapp;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.ntl.LNonTiledLayer;
import org.vaadin.addonhelpers.AbstractTest;

import com.vaadin.ui.Component;

public class BasicHeatTest extends AbstractTest {

    private LNonTiledLayer layer;

    @Override
    public String getDescription() {
        return "Test leaflet heat map feature";
    }

    private LMap leafletMap;

    @Override
    public Component getTestComponent() {
        leafletMap = new LMap();
        leafletMap.setHeight("100%");
        leafletMap.setCenter(0, 0);
        leafletMap.setMinZoom(0);
        leafletMap.setMaxZoom(5);
        
       
        HashMap<Double,String> gradient = new LinkedHashMap<>();
        // {0.4: 'blue', 0.65: 'lime', 1: 'red'}
        gradient.put(0.4, "blue");
        gradient.put(0.65, "lime");
        gradient.put(1.0, "red");
        
     
        
        leafletMap.zoomToContent();

        return leafletMap;
    }

}
