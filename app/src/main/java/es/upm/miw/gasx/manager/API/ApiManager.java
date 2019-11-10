package es.upm.miw.gasx.manager.API;

import java.util.ArrayList;
import java.util.List;

import es.upm.miw.gasx.models.GasStation;
import es.upm.miw.gasx.models.GasStationAPIObject;
import retrofit2.Call;

public class ApiManager {

    ApiClient apiClient = new ApiClient();


    public List<GasStation>gegetGasStationPriceByLocality(String location){

        List<GasStation>gasStations = new ArrayList();
        Call<List<GasStationAPIObject>> getGasStations =
                apiClient.getGasStationPriceByLocality(location);

        try {
            List<GasStationAPIObject> gasStationsRaw = getGasStations.execute().body();
            gasStations = ConvertAPIObjetcIntoAppObject(gasStationsRaw);
        }catch (Exception ex){}
        return gasStations;

    }

    //region Converter

    private List<GasStation>ConvertAPIObjetcIntoAppObject(List<GasStationAPIObject>gasStations){
        List<GasStation>gasStationsConverted = new ArrayList();
        for (GasStationAPIObject gasStation:gasStations) {

            gasStationsConverted.add(new GasStation(
                    Float.toString(gasStation.getObjectid()),
                    gasStation.getProvincia(),
                    gasStation.getMunicipio(),
                    gasStation.getLocalidad(),
                    gasStation.getDireccion(),
                    gasStation.getLatitud(),
                    gasStation.getLongitud(),
                    gasStation.getPrecio_biodiesel(),
                    gasStation.getPrecio_bioetanol(),
                    gasStation.getPrecio_gasoleo_a(),
                    gasStation.getPrecio_gasoleo_b(),
                    gasStation.getPrecio_gasolina_95(),
                    gasStation.getPrecio_gasolina_98(),
                    gasStation.getPrecio_nuevo_gasoleo_a(),
                    gasStation.getRotulo(),
                    gasStation.getHorario()
            ));
        }
        return gasStationsConverted;
    }





    //endregion

}
