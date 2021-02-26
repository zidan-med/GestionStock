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
public class Langue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long langue_id;
    private String langue_nom;
    private String langue_niveau;
    @ManyToOne
    @JoinColumn(name = "id_langue", insertable = false, updatable = false)
    private Candidat candidat;
    private Long langueid;
}
