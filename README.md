# v-leaflet-ntl
NonLayerTiled for Vaadin V-Leaflet

A simple plugin for Vaadin V-Leaflet based on this plugin https://github.com/ptv-logistics/Leaflet.NonTiledLayer

Lucana Sistemi s.r.l - Matera (http://www.lucanasistemi.com)

## Basic Use:
```
LMap map = new LMap();

map.setView(40.666565 , 16.61098, 14.5);

LNonTiledLayer ntl= new LNonTiledLayer();

ntl.setUrl("your wms service url");
ntl.setLayers("your layer");


//change the parameters below if your layer looks white or non trasparent

ntl.setFormat("image/png");
ntl.setTransparent(true);

////Other params (view documentation of NonTiledLayer)
ntl.setPane("tilePane");
ntl.setOpacity(1.0);

map.addLayer(ntl);
```
