package io.purplesoft.sumup

import android.util.Log
import com.sumup.merchant.reader.api.SumUpState
import io.flutter.embedding.android.FlutterApplication

class SumupApplication : FlutterApplication() {
    private val tag = "SumupApplication"

    override fun onCreate() {
        // Call Flutter's onCreate first to ensure all Flutter functionality is preserved
        super.onCreate()
        
        Log.d(tag, "onCreate - Initializing SumUp SDK")
        
        try {
            // Initialize SumUp SDK in Application class
            SumUpState.init(this)
            Log.d(tag, "SumUp SDK initialized successfully")
        } catch (e: Exception) {
            Log.e(tag, "Failed to initialize SumUp SDK", e)
            // Don't crash the app if SumUp fails to initialize
        }
    }
}
