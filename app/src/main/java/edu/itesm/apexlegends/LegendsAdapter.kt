package edu.itesm.apexlegends

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LegendsAdapter (private val legend: List<Legend>)
    : RecyclerView.Adapter<LegendsAdapter.LegendViewHolder>() {

    inner class LegendViewHolder(renglon: View): RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre)
        var rango = renglon.findViewById<TextView>(R.id.rango)
        var asptec = renglon.findViewById<TextView>(R.id.asptec)
        var fotoA = renglon.findViewById<ImageView>(R.id.fotoA)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LegendViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.leyends_renglon,parent,false)
        return LegendViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: LegendViewHolder, position: Int) {
        val legend = legend[position]
        holder.fotoA.setImageResource(legend.foto)
        holder.nombre.text = legend.nombre
        holder.rango.text = legend.rango
        holder.asptec.text = legend.asptec
    }

    override fun getItemCount(): Int {
        return legend.size
    }
}