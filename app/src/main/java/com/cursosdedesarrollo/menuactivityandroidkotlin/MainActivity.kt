package com.cursosdedesarrollo.menuactivityandroidkotlin

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        Log.d("app:MainActivity","onCreate")
        // Aplicacion application=(Aplicacion)getApplication
        Log.d("app:MainActivity","dato: ${(application as Aplicacion).dato}")
        /*
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        */
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

         when (item.itemId) {
             R.id.add_main_menu -> {
                 informaUsuario("Add pulsado")
             }
             R.id.edit_main_menu ->{
                 informaUsuario("Edit pulsado")
             }
             R.id.remove_main_menu -> {
                 informaUsuario("Remove pulsado")
             }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
        return true
    }

    private fun informaUsuario(texto: String="Pulsado") {
        Log.d("App:", texto)
        Snackbar.make(toolbar, texto, Snackbar.LENGTH_LONG).show()
    }
}
