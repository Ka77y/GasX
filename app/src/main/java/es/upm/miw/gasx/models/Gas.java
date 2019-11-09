package es.upm.miw.gasx.models;

public class Gas {

    private int ID;
    private String Code;
    private String Name;
    private String ActualPrice;
    private String LastPrice;

    public Gas(int ID, String code, String name, String actualPrice, String lastPrice) {
        this.ID = ID;
        Code = code;
        Name = name;
        ActualPrice = actualPrice;
        LastPrice = lastPrice;
    }

    public Gas(String code, String name, String actualPrice, String lastPrice) {
        Code = code;
        Name = name;
        ActualPrice = actualPrice;
        LastPrice = lastPrice;
    }

    //Getters and Setters

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getActualPrice() {
        return ActualPrice;
    }

    public void setActualPrice(String actualPrice) {
        ActualPrice = actualPrice;
    }

    public String getLastPrice() {
        return LastPrice;
    }

    public void setLastPrice(String lastPrice) {
        LastPrice = lastPrice;
    }
}
