package com.grid.gathergrid.service;

import com.grid.gathergrid.repository.EventRepository;

public class EventService {
    private final EventRepository eventRepository;

    public EventService() {
        eventRepository = new EventRepository();
    }
}
