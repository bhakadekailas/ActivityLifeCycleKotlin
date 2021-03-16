package bhakadekailas.androidlifecycle

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate: ")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: ")
    }


    fun callDialog(view: View) {
        Log.e(TAG, "callDialog: ")
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setMessage("Hello Kailas")
                .setCancelable(false)
                .setPositiveButton("Ok", DialogInterface.OnClickListener { dialog, id ->
                    dialog.dismiss()

                })

        val alert = dialogBuilder.create()
        alert.setTitle("Test")
        alert.show()
    }
}