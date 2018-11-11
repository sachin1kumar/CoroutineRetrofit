package advice.detailed.com.randomadvice

import advice.detailed.com.randomadvice.ViewModel.MyViewModel
import android.arch.lifecycle.ViewModel
import android.support.v7.app.AppCompatActivity
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var adviceText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adviceText = findViewById(R.id.advice)

        val viewModel = ViewModelProviders.of(this)
            .get(MyViewModel::class.java)


        (viewModel).getAdvicefromApi().observe(this,
            android.arch.lifecycle.Observer{
                adviceText.text = it
        })
    }
}
