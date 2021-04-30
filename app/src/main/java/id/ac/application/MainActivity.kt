package id.ac.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            //berpindah activity Intent(activity-saat-ini, activity-tujuan)
            val go = Intent(this@MainActivity, Dashboard::class.java)

            //menjalankan intent
            startActivity(go)
        }
    }
}