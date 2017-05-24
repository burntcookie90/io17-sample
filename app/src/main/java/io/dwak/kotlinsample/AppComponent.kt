package io.dwak.kotlinsample

import dagger.Component

@Component(modules = arrayOf(MainActivityModule::class))
interface AppComponent {
  fun inject(into: NoteApplication)
}