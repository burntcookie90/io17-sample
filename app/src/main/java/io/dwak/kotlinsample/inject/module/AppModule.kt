package io.dwak.kotlinsample.inject.module

import android.content.Context
import dagger.Module
import dagger.Provides
import io.dwak.kotlinsample.NoteApplication
import java.util.concurrent.Executor
import java.util.concurrent.Executors

@Module
class AppModule {
  @Provides fun context(app: NoteApplication) : Context = app.applicationContext

  @Provides fun executor(): Executor = Executors.newCachedThreadPool()
}