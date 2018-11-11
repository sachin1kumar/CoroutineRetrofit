package advice.detailed.com.randomadvice

import advice.detailed.com.randomadvice.Model.Slip
import android.arch.lifecycle.LiveData
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/advice")
    fun getAdvice() : Deferred<Response<String>>

}