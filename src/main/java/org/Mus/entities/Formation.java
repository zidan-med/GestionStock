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
public class Formation implements Serializable {
    @Id
    private Long formation_id;
    private String formation_Type;
    private Date formation_debut;
    private Date formation_fin;
    private String etablisement;
    private String diplome;
    private String diplome_lieu;
    @ManyToOne
    @JoinColumn(name = "id_formation", insertable = false, updatable = false)
    private Candidat candidat;
    private Long formationid;

}