package com.egenvall.travelplanner.common.threading

import io.reactivex.Scheduler


interface UiExecutor {
    val scheduler: Scheduler
}