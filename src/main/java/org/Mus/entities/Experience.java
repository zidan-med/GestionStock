package org.Mus.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Experience implements Serializable {
    @Id
    private Long experience_id;
    private String experience_poste;
    private String secteur_activite;
    private Date experience_debut;
    private Date experience_fin;

    @ManyToOne()
    @JoinColumn(name = "id_experience", insertable = false, updatable = false)
    private Candidat candidat;
    private Long experienceid;

}