package org.Mus.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Competence implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long competence_id;
    private String description;
    @ManyToOne()
    @JoinColumn(name = "id_competence", insertable = false, updatable = false)
    private Candidat candidat;
    private Long competenceid;
}
