package es.upm.miw.gasx.models;

public enum GasType {

    GAS_95("E5"),
    GAS_98("E10"),
    GASOLEO_A("GA"),
    GASOLEO_B("GB"),
    BIOETANOL("BI"),
    NUEVO_GASOLEO_A("NGA"),
    BIODIESEL("BD");

    private String GasCode;

    GasType(String gasCode){
        this.GasCode = gasCode;
    }

    public String getGasCode(){
        return GasCode;
    }
}

