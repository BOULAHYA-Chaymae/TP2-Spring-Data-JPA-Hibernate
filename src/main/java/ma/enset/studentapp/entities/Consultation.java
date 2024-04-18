package ma.enset.studentapp.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Consultation {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    private Date dateconsultation;
    private String rapport;
    @OneToOne
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)

    private RendezVous rendezvous;
}
