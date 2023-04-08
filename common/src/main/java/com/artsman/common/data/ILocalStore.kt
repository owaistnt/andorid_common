package com.artsman.common.data

interface ILocalStore {
    fun setString(key: LocalStoreKey, value: String)
    fun getString(key: LocalStoreKey): String

    fun setInt(key: LocalStoreKey, value: Int)
    fun getInt(key: LocalStoreKey) : Int

    fun setBoolean(key: LocalStoreKey, value: Boolean)
    fun getBoolean(key: LocalStoreKey) : Boolean

    fun setFloat(key: LocalStoreKey, value: Float)
    fun getFloat(key: LocalStoreKey) : Float

    fun setLong(key: LocalStoreKey, value: Long)
    fun getLong(key: LocalStoreKey) : Long

}

typealias LocalStoreKey =  String