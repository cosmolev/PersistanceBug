package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language extends Model {
    @Id
    public Integer id;

    public String code;

    public static Finder<Integer,Language> FIND = new Finder<Integer, Language>(Integer.class,Language.class);

    private static Language getByCode(String code){
        return FIND.where().eq("code",code).findUnique();
    }

    public static Language getEnglish(){
        return getByCode("en");
    }
}
