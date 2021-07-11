package software.mdev.bookstracker.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface BooksOLIDAPI {
    @GET("isbn/{isbn}")
    suspend fun getBookFromOLID(
        @Path("isbn")
        isbn: String
    ): Response<OpenLibraryOLIDResponse>
}