package constants;

public enum Gender {

    MALE(1),
    FEMALE(2);

    private final int genderID;

    Gender(int genderID) {
        this.genderID = genderID;
    }

    public int getGenderID() {
        return genderID;
    }
}
