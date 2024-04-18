package ma.enset.studentapp.service;

import ma.enset.studentapp.entities.Consultation;
import ma.enset.studentapp.entities.Medecin;
import ma.enset.studentapp.entities.Patient;
import ma.enset.studentapp.entities.RendezVous;

public interface IHospitalService {
     Patient savePatient(Patient patient);
     Medecin saveMedecin(Medecin medecin);
     RendezVous saveRendezVous(RendezVous rendezVous);
     Consultation saveConsultation(Consultation consultation);

}
