package com.siddiqei.cleanmvvm_hilt_coroutine_either.data

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class GlobalData {
    @SerializedName("Global")
    @Expose
    private var global: Global? = null

    @SerializedName("Countries")
    @Expose
    private var countries: List<Country?>? = null

    fun getGlobal(): Global? {
        return global
    }

    fun setGlobal(global: Global?) {
        this.global = global
    }

    fun getCountries(): List<Country?>? {
        return countries
    }

    fun setCountries(countries: List<Country?>?) {
        this.countries = countries
    }
}