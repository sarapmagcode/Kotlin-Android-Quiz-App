package androidlovers.example.androidquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // remove status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        // redirect to input name activity (after 3 secs)
        Handler().postDelayed({
            val intent = Intent(this@MainActivity, InputName::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}