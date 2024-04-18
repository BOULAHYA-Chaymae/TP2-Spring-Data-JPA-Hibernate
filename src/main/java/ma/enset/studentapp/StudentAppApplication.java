package ma.enset.studentapp;

import ma.enset.studentapp.entities.*;
import ma.enset.studentapp.repository.ConsultationRepository;
import ma.enset.studentapp.repository.MedecinRepository;
import ma.enset.studentapp.repository.PatientRepository;
import ma.enset.studentapp.repository.RendezVousRepository;
import ma.enset.studentapp.service.IHospitalService;
import ma.enset.studentapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class StudentAppApplication  {
    public static void main(String[] args) {
        SpringApplication.run(StudentAppApplication.class, args);
    }

    CommandLineRunner start (IHospitalService hospitalService,MedecinRepository medecinRepository,PatientRepository patientRepository,RendezVousRepository rendezVousRepository,UserService userService) {
        return args -> {
            Stream.of("Houda","hanan","hind")
                    .forEach(name->{
            Patient patient=new Patient();
            patient.setName("chaymae");
            patient.setDate(new Date());
            patient.setMalade(false);
            hospitalService.savePatient(patient);

                });
            Stream.of("Mohamed","aymane","ilyas")
                    .forEach(name->{
                        Medecin medecin=new Medecin();
                        medecin.setName("chaymae");
                        medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                        medecin.setEmail(name+"@gmail.com");
                        hospitalService.saveMedecin(medecin);

                    });
            Patient patient=patientRepository.findById(1l).orElse(null);
            Patient patient1=patientRepository.findByName("houda");
            Medecin medecin=medecinRepository.findByName("Mohamed");
            RendezVous rendezVous=new RendezVous();
            rendezVous.setStatus(StatusRDV.Pending);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            RendezVous saveRDV=hospitalService.saveRendezVous(rendezVous);
            System.out.println(saveRDV.getId());

            RendezVous rendezVous1=rendezVousRepository.findAll().get(0);

            Consultation consultation=new Consultation();
            consultation.setDateconsultation(new Date());
            consultation.setRendezvous(rendezVous1);
            consultation.setRapport("Rapport de la consultation.......");
            hospitalService.saveConsultation(consultation);



            User u=new User();
            u.setUsername("user1");
            u.setPassword("123456");
            userService.addNewUser(u);

            User u2=new User();
            u2.setUsername("user1");
            u2.setPassword("123456");
            userService.addNewUser(u2);

            Stream.of("StUDENT","USER","ADMIN").forEach(r->{
                Role role1=new Role();
                role1.setRoleName(r);
                userService.addNewRole(role1);

            });

            userService.addRoleToUser("user1","STUDENT");
            userService.addRoleToUser("user1","USER");
            userService.addRoleToUser("admin","STUDENT");
            userService.addRoleToUser("admin","USER");









        };
    }


}
