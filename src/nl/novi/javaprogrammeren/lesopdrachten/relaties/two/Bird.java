package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

public class Bird {

//    Geef de klasse Bird de volgende instance variables: nickname, species, ringNumber
//    De species en ringNumber variables mogen na instantiatie niet meer aangepast worden.

    private final String species;
    private final String ringNumber;
    private String nickName;

    public Bird(String species, String ringNumber, String nickName) {
        this.species = species;
        this.ringNumber = ringNumber;
        this.nickName = nickName;
    }

    public String getSpecies() {
        return species;
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
