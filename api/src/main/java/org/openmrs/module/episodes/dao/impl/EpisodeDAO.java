package org.openmrs.module.episodes.dao.impl;

import org.openmrs.Encounter;
import org.openmrs.PatientProgram;
import org.openmrs.module.episodes.Episode;

import java.util.List;

public interface EpisodeDAO {
    void save(Episode episode);

    Episode get(Integer episodeId);

    Episode getEpisodeForPatientProgram(PatientProgram patientProgram);

    Episode getEpisodeForEncounter(Encounter encounter);

    List<Episode> getAllEpisodes();
}
