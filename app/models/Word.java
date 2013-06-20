package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Word extends Model {
    @Id
    public Integer id;

    @ManyToOne
    public Language language;
    public Word(Language language) {
        this.language = language;
        this.save();
    }
}
