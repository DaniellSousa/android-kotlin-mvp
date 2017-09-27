package br.com.liveo.mvp.screen.home.di

import android.support.annotation.NonNull
import br.com.liveo.mvp.data.source.remote.ApiEndPoint
import br.com.liveo.mvp.di.scope.ActivityScoped
import br.com.liveo.mvp.screen.home.HomeContract
import br.com.liveo.mvp.screen.home.HomeInteractor
import br.com.liveo.mvp.screen.home.HomePresenter
import br.com.liveo.mvp.util.scheduler.BaseScheduler
import br.com.liveo.mvp.util.scheduler.SchedulerProvider
import dagger.Module
import dagger.Provides

/**
 * Created by rudsonlima on 9/2/17.
 */
@Module
class HomeModule {

    @Provides
    @ActivityScoped
    internal fun provideHomeInteractor(apiEndPoint: ApiEndPoint): HomeContract.Interactor =
            HomeInteractor(apiEndPoint)

    @Provides
    @ActivityScoped
    internal fun provideHomePresenter(@NonNull interactor: HomeContract.Interactor,
                                      @NonNull scheduler: BaseScheduler): HomeContract.Presenter =
            HomePresenter(interactor, scheduler)

    @Provides
    internal fun provideScheduleProvider(): BaseScheduler = SchedulerProvider.instance
}
