package com.aftershoot.declutter.model

import android.graphics.Bitmap
import android.net.Uri

data class Image(val uri: Uri,
                 var thumbnail: Bitmap?,
                 val name: String,
                 val size: String,
                 val dateTaken: String?)