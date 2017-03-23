package de.nicidienase.chaosflix.network;

import java.util.List;

import de.nicidienase.chaosflix.entities.Conference;
import de.nicidienase.chaosflix.entities.Conferences;
import de.nicidienase.chaosflix.entities.Event;
import de.nicidienase.chaosflix.entities.Recording;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by felix on 17.03.17.
 */

public interface RecordingService {

	@GET("public/conferences")
	Call<Conferences> listConferences();

	@GET("public/conferences/{id}")
	Call<Conference> getConference(@Path("id") int id);

	@GET("public/events")
	Call<List<Event>> getEvents();

	@GET("public/events/{id}")
	Call<Event> getEvent(@Path("id") int id);

	@GET("public/recordings/{id}")
	Call<Recording> getRecording(@Path("id") int id);

}
