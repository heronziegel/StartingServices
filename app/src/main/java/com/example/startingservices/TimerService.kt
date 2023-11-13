package com.example.startingservices

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class TimerService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        runTimer()

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    fun runTimer(){
        Thread {
            for(i in num downTo 0){
                Log.d("Countdown", i.toString())
                Thread.sleep(1000)
        }
            stopSelf()
        }.start()
    }

    override fun onDestroy(){
        Log.d("Service State", "STOPPED")
        super.onDestroy()
    }
}