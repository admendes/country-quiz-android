package com.example.quiz

import org.json.JSONObject
import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import javax.net.ssl.HttpsURLConnection

object RequestsREST {
    @Throws(IOException::class)
    fun doGET(url: URL): String? {
        var stream: InputStream? = null
        var connection: HttpURLConnection? = null
        var result: String? = null
        try {
            connection = url.openConnection() as HttpURLConnection
            // Timeout for reading InputStream arbitrarily set to 10000ms.
            connection.readTimeout = 10000
            // Timeout for connection.connect() arbitrarily set to 10000ms.
            connection!!.connectTimeout = 10000
            // For this use case, set HTTP method to GET.
            connection.requestMethod = "GET"
            // Already true by default but setting just in case; needs to be true since this request
            // is carrying an input (response) body.
            connection.doInput = true
            // Open communications link (network traffic occurs here).
            connection.connect()
            val responseCode = connection.responseCode
            if (responseCode != HttpsURLConnection.HTTP_OK) {
                throw IOException("HTTP error code: $responseCode")
            }
            // Retrieve the response body as an InputStream.
            stream = connection.inputStream
            if (stream != null) {
                // Converts Stream to String with max length of 1024.
                result = readStream(stream, 1000000)
            }
        } finally {
            // Close Stream and disconnect HTTPS connection.
            stream?.close()
            connection?.disconnect()
        }
        return result
    }

    @Throws(IOException::class)
    fun doPOST(url: URL, data: JSONObject): String? {
        var stream: InputStream? = null
        var out: OutputStream? = null
        var connection: HttpURLConnection? = null
        var result: String? = null
        try {
            connection = url.openConnection() as HttpURLConnection
            // Timeout for reading InputStream arbitrarily set to 10000ms.
            connection.readTimeout = 10000
            // Timeout for connection.connect() arbitrarily set to 10000ms.
            connection!!.connectTimeout = 10000
            // For this use case, set HTTP method to GET.
            connection.requestMethod = "POST"
            // Already true by default but setting just in case; needs to be true since this request
            // is carrying an input (response) body.
            connection.doInput = true
            connection.doOutput = true
            connection.setChunkedStreamingMode(0)
            connection.setRequestProperty("Accept", "application/json")
            connection.setRequestProperty("Content-type", "application/json")
            // Open communications link (network traffic occurs here).
            out = BufferedOutputStream(connection.outputStream)
            out.write(data.toString().toByteArray())
            out.flush()
            val responseCode = connection.responseCode
            if (responseCode != HttpsURLConnection.HTTP_OK) {
                throw IOException("HTTP error code: $responseCode")
            }
            // Retrieve the response body as an InputStream.
            stream = connection.inputStream
            if (stream != null) {
                // Converts Stream to String with max length of 1K.
                result = readStream(stream, 1024)
            }
        } finally {
            // Close streams and disconnect HTTP connection.
            out?.close()
            stream?.close()
            connection?.disconnect()
        }
        return result
    }

    @Throws(IOException::class)
    private fun readStream(stream: InputStream, maxLength: Int): String? {
        var result: String? = null
        // Read InputStream using the UTF-8 charset.
        val reader = InputStreamReader(stream, "UTF-8")
        // Create temporary buffer to hold Stream data with specified max length.
        val buffer = CharArray(maxLength)
        // Populate temporary buffer with Stream data.
        var numChars = 0
        var readSize = 0
        while (numChars < maxLength && readSize != -1) {
            numChars += readSize
            val pct = 100 * numChars / maxLength
            readSize = reader.read(buffer, numChars, buffer.size - numChars)
        }
        if (numChars != -1) {
            // The stream was not empty.
            // Create String that is actual length of response body if actual length was less than
            // max length.
            numChars = Math.min(numChars, maxLength)
            result = String(buffer, 0, numChars)
        }
        return result
    }
}