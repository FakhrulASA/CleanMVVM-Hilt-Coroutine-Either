package com.siddiqei.cleanmvvm_hilt_coroutine_either.data

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class Country {
    @SerializedName("Country")
    @Expose
    private val country: String? = null

    @SerializedName("CountryCode")
    @Expose
    private val countryCode: String? = null

    @SerializedName("Slug")
    @Expose
    private val slug: String? = null

    @SerializedName("NewConfirmed")
    @Expose
    private val newConfirmed: Int? = null

    @SerializedName("TotalConfirmed")
    @Expose
    private val totalConfirmed: Int? = null

    @SerializedName("NewDeaths")
    @Expose
    private val newDeaths: Int? = null

    @SerializedName("TotalDeaths")
    @Expose
    private val totalDeaths: Int? = null

    @SerializedName("NewRecovered")
    @Expose
    private val newRecovered: Int? = null

    @SerializedName("TotalRecovered")
    @Expose
    private val totalRecovered: Int? = null

    @SerializedName("Date")
    @Expose
    private val date: String? = null

}