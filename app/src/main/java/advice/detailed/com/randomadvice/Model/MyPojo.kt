package advice.detailed.com.randomadvice.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class MyPojo {

    @SerializedName("slip")
    @Expose
    var slip: Slip? = null

    override fun toString(): String {
        return "ClassPojo [slip = $slip]"
    }
}

