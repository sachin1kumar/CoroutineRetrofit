package advice.detailed.com.randomadvice.ViewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import advice.detailed.com.randomadvice.ApiClient

class MyViewModel : ViewModel() {

    lateinit var advice: MutableLiveData<String>
    private val viewModelJob = Job()

    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)


    fun getAdvicefromApi() : MutableLiveData<String> {

        advice = MutableLiveData()
        val service = ApiClient.retrofitClient()

        uiScope.launch{
            var strAdvice = service.getAdvice()
            var response=strAdvice.await()
            advice.value= response.toString()
        }

        return advice
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}