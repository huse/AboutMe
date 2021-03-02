package com.hus.kpr.aboutme

import android.os.Parcel
import android.os.Parcelable

data class MyName(var name: String = "Quantum M",
                  var nickname: String = "") : Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyName> {
        override fun createFromParcel(parcel: Parcel): MyName {
            return MyName(parcel)
        }

        override fun newArray(size: Int): Array<MyName?> {
            return arrayOfNulls(size)
        }
    }
}



