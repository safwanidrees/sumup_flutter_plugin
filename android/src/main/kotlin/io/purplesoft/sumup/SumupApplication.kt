package io.purplesoft.sumup

import android.app.Application
import android.util.Log
import com.sumup.merchant.reader.api.SumUpState

class SumupApplication : Application() {
    private val tag = "SumupApplication"

    override fun onCreate() {
        super.onCreate()
        Log.d(tag, "onCreate - Initializing SumUp SDK")
        
        try {
            // Initialize SumUp SDK in Application class
            SumUpState.init(this)
            Log.d(tag, "SumUp SDK initialized successfully")
        } catch (e: Exception) {
            Log.e(tag, "Failed to initialize SumUp SDK", e)
        }
    }
}
