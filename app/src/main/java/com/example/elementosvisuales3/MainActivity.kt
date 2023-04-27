package com.example.elementosvisuales3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {
    private lateinit var adilog: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adilog = findViewById(R.id.activi_main_dialog)
        adilog.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                val fragment:DialogFragment = EstudianteDialog()
                fragment.show(supportFragmentManager,"Estudiante")
            }
        })


    }
}