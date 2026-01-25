/*
 * SPDX-FileCopyrightText: 2021-2025 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.settings.device

import android.os.Bundle
import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity

class DeviceSettingsActivity : CollapsingToolbarBaseActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager
            .beginTransaction()
            .replace(
                com.android.settingslib.collapsingtoolbar.R.id.content_frame,
                DeviceSettingsFragment(),
                TAG,
            )
            .commit()
    }

    companion object {
        private const val TAG = "DeviceSettingsActivity"
    }
}
