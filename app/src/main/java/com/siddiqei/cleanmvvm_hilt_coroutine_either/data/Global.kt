package com.siddiqei.cleanmvvm_hilt_coroutine_either.data

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class Global {
    @SerializedName("NewConfirmed")
    @Expose
    private var newConfirmed: Int? = null

    @SerializedName("TotalConfirmed")
    @Expose
    private var totalConfirmed: Int? = null

    @SerializedName("NewDeaths")
    @Expose
    private var newDeaths: Int? = null

    @SerializedName("TotalDeaths")
    @Expose
    private var totalDeaths: Int? = null

    @SerializedName("NewRecovered")
    @Expose
    private var newRecovered: Int? = null

    @SerializedName("TotalRecovered")
    @Expose
    private var totalRecovered: Int? = null
}