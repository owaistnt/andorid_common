package com.artsman.common.data

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.artsman.common.R

class SharePreferenceLocalStore(private val context: Context): ILocalStore{

    private val preference by lazy {
            context.getSharedPreferences(context.getString(R.string.default_preference_file), MODE_PRIVATE)
    }
    override fun setString(key: LocalStoreKey, value: String) {
        preference.edit().putString(key, value).apply()
    }

    override fun getString(key: LocalStoreKey) : String{
       return preference.getString(key, "")?: ""
    }

    override fun setInt(key: LocalStoreKey, value: Int) {
        preference.edit().putInt(key, value).apply()
    }

    override fun getInt(key: LocalStoreKey) : Int{
        return preference.getInt(key, -1)
    }

    override fun setBoolean(key: LocalStoreKey, value: Boolean) {
        preference.edit().putBoolean(key, value).apply()
    }

    override fun getBoolean(key: LocalStoreKey) :  Boolean{
        return preference.getBoolean(key, false)
    }

    override fun setFloat(key: LocalStoreKey, value: Float) {
        preference.edit().putFloat(key, value).apply()
    }

    override fun getFloat(key: LocalStoreKey): Float {
        return preference.getFloat(key, -1f)
    }

    override fun setLong(key: LocalStoreKey, value: Long) {
        preference.edit().putLong(key, value).apply()
    }

    override fun getLong(key: LocalStoreKey) : Long {
        return preference.getLong(key, -1L)
    }

}