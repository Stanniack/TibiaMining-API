package model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class LevelAdvance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLevelAdvance;

    @ManyToOne
    @JoinColumn(name = "idCharacter", nullable = true)
    private Personagem personagem;

    private Long expDay;
    private int levelDay;
    private String playerName;

    @Temporal(TemporalType.DATE)
    private Calendar lastUpdate;

    public LevelAdvance() {
    }

    public LevelAdvance(Personagem personagem, Long expDay, int levelDay, Calendar lastUpdate) {
        this.personagem = personagem;
        this.expDay = expDay;
        this.levelDay = levelDay;
        this.lastUpdate = lastUpdate;
    }

    public LevelAdvance(Personagem personagem, int levelDay, Calendar lastUpdate) {
        this.personagem = personagem;
        this.levelDay = levelDay;
        this.lastUpdate = lastUpdate;
    }

    public LevelAdvance(Long expDay, int levelDay, String playerName, Calendar lastUpdate) {
        this.expDay = expDay;
        this.levelDay = levelDay;
        this.lastUpdate = lastUpdate;
        this.playerName = playerName;
        
    }

    public Long getExpDay() {
        return expDay;
    }

    public void setExpDay(Long expDay) {
        this.expDay = expDay;
    }

    public int getLevelDay() {
        return levelDay;
    }

    public void setLevelDay(int levelDay) {
        this.levelDay = levelDay;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getIdLevelAdvance() {
        return idLevelAdvance;
    }

    public void setIdLevelAdvance(Integer idLevelAdvance) {
        this.idLevelAdvance = idLevelAdvance;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}
