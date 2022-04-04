package androidlovers.example.androidquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // remove status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        // back button
        val actionBar = supportActionBar!!
        actionBar.setDisplayHomeAsUpEnabled(true)

        // set team info
        val teamInfo = findViewById<TextView>(R.id.team_info)
        teamInfo.setText("A developer's primary duty is to create, maintain, and implement the source code to develop mobile apps and mobile platform programs that meet the needs and requirements of the clients using the computer programming languages.")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}