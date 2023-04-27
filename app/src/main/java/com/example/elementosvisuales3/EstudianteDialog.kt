package com.example.elementosvisuales3
import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class EstudianteDialog: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity);

        builder.setMessage("Estudiante de IDS").setPositiveButton("Si"){
            dialogIterface,i ->
        }
            .setNegativeButton("No"){
                dialogInterface, i ->
            }
        return builder.create()
    }
}