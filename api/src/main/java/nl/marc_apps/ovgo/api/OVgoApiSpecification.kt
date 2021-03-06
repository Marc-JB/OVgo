package nl.marc_apps.ovgo.api

import nl.marc_apps.ovgo.domain.models.Departure
import nl.marc_apps.ovgo.domain.models.Disruption
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface OVgoApiSpecification {
    @GET("v0/stations/{id}/departures.json")
    suspend fun getDepartures(
        @Path("id") station: String,
        @Header("accept-language") language: String = "en"
    ): Response<Set<Departure>>

    @GET("v1/disruptions.json")
    suspend fun getDisruptions(
        @Query("actual") actual: Boolean = true,
        @Header("accept-language") language: String = "en"
    ): Response<Set<Disruption>>
}