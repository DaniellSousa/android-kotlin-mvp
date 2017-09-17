package br.com.liveo.mvp.util.scheduler

import io.reactivex.Scheduler

/**
 * Created by rudsonlima on 8/29/17.
 */
interface BaseScheduler {

    fun computation(): Scheduler

    fun io(): Scheduler

    fun ui(): Scheduler
}
