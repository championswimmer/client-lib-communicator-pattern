package tech.arnav.app

import tech.arnav.lib.NetworkLib
import tech.arnav.lib.NetworkLibCommunicator

class Main {
    companion object {
        const val  BASE_URL = "https://cb.lk"
    }

    lateinit var networkLib: NetworkLib

    val networkComm = object : NetworkLibCommunicator {

        override fun getApiKey(): String? {
            return restoreApiKey()
        }

        override fun getBaseUrl(): String {
            return BASE_URL
        }
    }

    init {
        networkLib = NetworkLib(networkComm)
    }

    fun onCreate() {

        networkLib.getCourses()

    }

    fun saveApiKey(apiKey: String) {}
    fun restoreApiKey(): String {return "XXX"}


}