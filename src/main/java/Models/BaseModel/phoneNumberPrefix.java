package Models.BaseModel;

public enum phoneNumberPrefix {
    A(50),
    B(55),
    C(70),
    D(77),
    E(71),
    F(51);

    private int numVal;
    phoneNumberPrefix(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
