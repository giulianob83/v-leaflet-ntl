package org.peimari.gleaflet.ntl.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.TextResource;

public interface LeafletNtlClientBundle extends ClientBundle {
 
    @Source("NonTiledLayer.js")
    @DoNotEmbed
    TextResource heatScript();
    
    @Source("NonTiledLayer.WMS.js")
    @DoNotEmbed
    TextResource heatScript2();

}
