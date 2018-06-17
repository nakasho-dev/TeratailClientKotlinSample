package io.github.nakasho_dev.teratailclientkotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.microsoft.appcenter.crashes.Crashes
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.utils.AppCenterLog


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(application, BuildConfig.APP_CENTER_API_KEY,
                Analytics::class.java, Crashes::class.java)
        Analytics.trackEvent("show MainAcitivity")
    }
}
