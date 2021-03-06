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
public class Guild implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGuild;

    @ManyToOne
    @JoinColumn(name = "idCharacter", nullable = true)
    private Player player;

    private String guildName;
    private String memberPositionGuild;

    @Temporal(TemporalType.DATE)
    private Calendar dateBegin;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataEnd;

    public Guild() {
    }

    public Guild(Player player, String guildName, String memberPositionGuild, Calendar dateBegin) {
        this.player = player;
        this.guildName = guildName;
        this.memberPositionGuild = memberPositionGuild;
        this.dateBegin = dateBegin;
    }

    public Guild(Player player, String guildName, String memberPositionGuild, Calendar dateBegin, Calendar dateLeave) {
        this.player = player;
        this.guildName = guildName;
        this.memberPositionGuild = memberPositionGuild;
        this.dateBegin = dateBegin;
        this.dataEnd = dateLeave;
    }

    public String getGuildName() {
        return guildName;
    }

    public void setGuildName(String nameGuild) {
        this.guildName = nameGuild;
    }

    public String getMemberPositionGuild() {
        return memberPositionGuild;
    }

    public void setMemberPositionGuild(String memberPositionGuild) {
        this.memberPositionGuild = memberPositionGuild;
    }

    public Calendar getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Calendar dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Calendar getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(Calendar dataEnd) {
        this.dataEnd = dataEnd;
    }

}
