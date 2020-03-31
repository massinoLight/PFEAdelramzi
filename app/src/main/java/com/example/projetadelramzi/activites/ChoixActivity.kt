package com.example.projetadelramzi.activites



import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.backendless.Backendless
import com.backendless.persistence.DataQueryBuilder
import com.example.projetadelramzi.R

import kotlinx.android.synthetic.main.activity_choix.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import java.util.ArrayList

class ChoixActivity : AppCompatActivity() {

    var lesurl = arrayListOf<String?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choix)

        val connMgr = getSystemService(Context.CONNECTIVITY_SERVICE)
                as ConnectivityManager
        when(connMgr.activeNetworkInfo?.type){
            ConnectivityManager.TYPE_WIFI, ConnectivityManager.TYPE_MOBILE ->{
                Log.e("EEEEEEEEEEE", "on va faire appel a la tache Asy!!!!")
                toast("le catalogue n'est tjr pas dispo")}
            null -> { toast("verifier votre connexion internet") }
        }



        trouver.setOnClickListener {

            //val intent = Intent(this, MapsActivity::class.java)

            //startActivity(intent)



        }

        proposer.setOnClickListener {

           // val intent = Intent(this, AccueilActivity::class.java)
            //intent.putStringArrayListExtra(ConfirmerActivity.EXTRA_PHOTOS, lesurl as ArrayList<String?>)

            //startActivity(intent)



        }


    }


}