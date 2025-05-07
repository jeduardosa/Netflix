package com.omeghabit.netflix.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Series(
    val nome: String,
    val descricao: String,
    val imagemId: Int
) : Parcelable
