package com.example.testtask.network.post

import android.os.Parcelable
import com.example.testtask.database.DatabaseUser
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserData(
    @SerializedName("id") val userId: Int,
    @SerializedName("name") val name: String,
    @SerializedName("username") val username: String,
    @SerializedName("email") val email: String,
    @SerializedName("address") val address: AddressData,
    @SerializedName("phone") val phone: String,
    @SerializedName("website") val website: String,
    @SerializedName("company") val company: CompanyData
) : Parcelable

@Parcelize
data class GeoData(

    @SerializedName("lat") val lat: Double,
    @SerializedName("lng") val lng: Double
) : Parcelable

@Parcelize
data class CompanyData(

    @SerializedName("name") val name: String,
    @SerializedName("catchPhrase") val catchPhrase: String,
    @SerializedName("bs") val bs: String
) : Parcelable

@Parcelize
data class AddressData(

    @SerializedName("street") val street: String,
    @SerializedName("suite") val suite: String,
    @SerializedName("city") val city: String,
    @SerializedName("zipcode") val zipcode: String,
    @SerializedName("geo") val geo: GeoData
) : Parcelable

fun List<UserData>.asDatabaseModel(): List<DatabaseUser> {
    return map {
        DatabaseUser(
            userId = it.userId,
            name = it.name,
            username = it.username,
            email = it.email,
            phone = it.phone,
            website = it.website
        )
    }

}


