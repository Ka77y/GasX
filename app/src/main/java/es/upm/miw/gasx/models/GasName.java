package es.upm.miw.gasx.models;

public enum GasName {

    GAS_95("Gasolina E5"),
    GAS_98("Gasolina E10"),
    GASOLEO_A("Gasoleo A"),
    GASOLEO_B("Gasoleo B"),
    BIOETANOL("Bioetanol"),
    NUEVO_GASOLEO_A("Nuevo Gasoleo A"),
    BIODIESEL("Biodiesel");

    private String GasName;

    GasName(String gasName){
        this.GasName = gasName;
    }

    public String getGasName(){
        return GasName;
    }
}