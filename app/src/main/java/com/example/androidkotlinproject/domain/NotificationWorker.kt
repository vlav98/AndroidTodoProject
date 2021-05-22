package com.example.androidkotlinproject.domain

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.androidkotlinproject.R
import com.example.androidkotlinproject.presentation.MainActivity

class NotificationWorker(appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {

    private val CHANNEL_ID = "999"
    private val NOTIFICATION_ID = 1

    override fun doWork(): Result {
        createNotificationChannel()
        showNotification()
        return Result.success()
    }

    private fun createNotificationChannel() {
        // Créer le NotificationChannel, seulement pour API 26+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Notification channel name"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance)
            channel.description = "Notification channel description"
            // Enregister le canal sur le système : attention de ne plus rien modifier après
            val notificationManager =
                applicationContext.getSystemService(NotificationManager::class.java)
            notificationManager?.createNotificationChannel(channel)
        }
    }

    private fun showNotification() {
        val notificationManager = NotificationManagerCompat.from(applicationContext)

        val message = "Message de la notification"

        val notifBuilder = NotificationCompat.Builder(applicationContext, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentTitle("Titre de ma notification")
            .setContentText(message)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        val contentIntent = PendingIntent.getActivity(
            applicationContext, 0,
            Intent(applicationContext, MainActivity::class.java), PendingIntent.FLAG_UPDATE_CURRENT
        )
        notifBuilder.setAutoCancel(true)
        notifBuilder.setContentIntent(contentIntent)
        notificationManager.notify(NOTIFICATION_ID, notifBuilder.build())

    }


}
