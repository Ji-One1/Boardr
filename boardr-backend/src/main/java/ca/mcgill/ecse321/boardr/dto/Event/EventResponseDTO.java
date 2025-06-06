package ca.mcgill.ecse321.boardr.dto.Event;

import ca.mcgill.ecse321.boardr.model.Event;

/**
 * DTO for returning Event details as a response. ResponseDTO is for the output.
 * Used when retrieving data from the backend such as getters.
 * 
 * @author David Vo
 * @version 2.0
 * @since 2025-03-12
 */
public class EventResponseDTO {

    private int eventId;
    private int eventDate;
    private int eventTime;
    private String location;
    private String description;
    private int maxParticipants;
    private int boardGameInstanceId;
    private int organizerId;

    @SuppressWarnings("unused")
    private EventResponseDTO() {}

    public EventResponseDTO(Event event) {
        this.eventId = event.getEventId();
        this.eventDate = event.getEventDate();
        this.eventTime = event.getEventTime();
        this.location = event.getLocation();
        this.description = event.getDescription();
        this.maxParticipants = event.getmaxParticipants();
        this.boardGameInstanceId = event.getboardGameInstance().getIndividualGameId();
        this.organizerId = event.getOrganizer().getUserAccountId();
    }

    public int getEventId() {
        return eventId;
    }

    public int getEventDate() {
        return eventDate;
    }

    public int getEventTime() {
        return eventTime;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public int getBoardGameInstanceId() {
        return boardGameInstanceId;
    }

    public int getOrganizerId() {
        return organizerId;
    }
}