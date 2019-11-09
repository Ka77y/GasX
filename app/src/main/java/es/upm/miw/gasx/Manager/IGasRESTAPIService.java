package es.upm.miw.gasx.Manager;

import java.util.List;

import es.upm.miw.gasx.models.Country;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import static es.upm.miw.gasx.Constants.GET_STATION_PRICES_ENDPOINT;
import static es.upm.miw.gasx.Constants.GET_STATION_PRICES_LOCATION_VARIABLE;

@SuppressWarnings("Unused")
public interface IGasRESTAPIService {

    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    @GET(GET_STATION_PRICES_ENDPOINT)
    Call<List<Country>> getGasStationPriceByLocality(
            @Path(GET_STATION_PRICES_LOCATION_VARIABLE) String location);


}
