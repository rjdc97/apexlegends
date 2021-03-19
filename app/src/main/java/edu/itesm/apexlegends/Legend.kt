package edu.itesm.apexlegends

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Legend(val foto:Int,
                  val nombre:String,
                  val rango:String,
                  val asptec: String,
                  val toast: String) : Parcelable
