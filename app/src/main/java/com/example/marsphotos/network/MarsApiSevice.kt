package com.example.marsphotos.network

// import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
// import kotlinx.serialization.json.Json
// import okhttp3.MediaType.Companion.toMediaType
// import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
// import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

// Retrofit configuration
// Base url from web service
//private const val BASE_URL =
//    "https://android-kotlin-fun-mars-server.appspot.com"

/*
    1. Create a compiler of retrofit to create the retrofit object
    2. addConverterFactory, indicate retrofit how to process data from web service
    3. ScalarsConverterFactory, convert strings and primitives to plain/text
    3.1 Json.adConverterFactory(), Deserialize Json to objects kotlin can understand
    4. baseUrl of the service
    5. build create the retrofit object
*/
    //.addConverterFactory(ScalarsConverterFactory.create())
    //.addConverterFactory(Json.asConverterFactory("application/json".toMediaType())) // not working
//private val retrofit = Retrofit.Builder()
//    .addConverterFactory(MoshiConverterFactory.create())
//    .baseUrl(BASE_URL)
//    .build()

// Define how retrofit communicate with web server via HTTP requests
// @GET indicate the request http method used
// ("photos") is the resource to get, and it is added to baseUrl
interface MarsApiService {
    @GET("photos")
    // suspend fun getPhotos(): String // async function
    suspend fun getPhotos(): List<MarsPhoto>
}

// Public Singleton object which can be accessed from the app
// It's an object declaration
//object MarsApi {
//    val retrofitService: MarsApiService by lazy {
//        /*
//        * create() function cost in terms of memory, speed and performance
//        * */
//        retrofit.create(MarsApiService::class.java)
//    }
//}
