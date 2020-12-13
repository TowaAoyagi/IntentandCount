package app.aoyagi.makkan.checkwork

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.view.View
import android.widget.TextView
import androidx.annotation.ColorRes

class MainActivity2 : AppCompatActivity() {
    var number: Int = 0
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        textView = findViewById(R.id.numberText)
    }

    fun plus(v: View) {
        number++
        if (number % 2 == 0) {
            textView.text = number.toString()
            textView.setTextColor(Color.BLACK)

        } else {
            textView.text = number.toString()
            textView.setTextColor(Color.BLUE)
        }
    }
}