package io.itsusinn.extension.base64

import java.util.* // ktlint-disable no-wildcard-imports

private val decoder = Base64.getUrlDecoder()
private val encoder = Base64.getUrlEncoder()
val ByteArray.base64
   get() = encoder.encodeToString(this)
val String.base64
   get() = encoder.encodeToString(this.toByteArray())
val String.debase64: String?
   get() {
      try {
         return String(decoder.decode(this))
      } catch (_: Throwable) {
         return null
      }
   }
val ByteArray.debase64: String?
   get() {
      try {
         return String(decoder.decode(this))
      } catch (_: Throwable) {
         return null
      }
   }
