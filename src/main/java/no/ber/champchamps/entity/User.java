package no.ber.champchamps.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import no.ber.champchamps.entity.bet.Bet;

@Entity
public class User extends BaseEntity {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    @OneToOne
    private Bet bet;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Bet getBet() {
        return bet;
    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }

}
