package advice.detailed.com.randomadvice.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Slip {

    @SerializedName("slip_id")
    @Expose
    var slip_id: String? = null

    @SerializedName("advice")
    @Expose
    var advice: String? = null

    override fun toString(): String {
        return "ClassPojo [slip_id = $slip_id, advice = $advice]"
    }
}