package fr.hd3d.html5.video.client.handlers;

import com.google.gwt.event.shared.EventHandler;

import fr.hd3d.html5.video.client.events.VideoPauseEvent;

public interface VideoPauseHandler extends EventHandler {
    void onPause(VideoPauseEvent event);
}
