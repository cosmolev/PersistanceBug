package models;

import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Phrase extends Model {

//Uncomment constructor to overcome the exception
//    public Phrase(String dummy) {
//    }

    @Id
    public Integer id;

    @OneToOne(cascade = CascadeType.PERSIST)
    public Word word = new Word(Language.getEnglish());

}
