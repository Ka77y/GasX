package es.upm.miw.gasx;

import java.util.List;

import es.upm.miw.gasx.models.Country;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


@SuppressWarnings("Unused")
interface ICountryRESTAPIService {

    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    // https://restcountries.eu/rest/v2/name/Spain
    @GET("/rest/v2/name/{countryName}")
    Call<List<Country>> getCountryByName(@Path("countryName") String countryName);

    // https://restcountries.eu/rest/v2/alpha/ES
    @GET("/rest/v2/alpha/{countryCode}")
    Call<Country> getCountryByCode(@Path("countryCode") String countryCode);

}
