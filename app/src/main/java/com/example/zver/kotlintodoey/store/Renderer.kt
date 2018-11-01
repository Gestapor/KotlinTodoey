    package com.example.zver.kotlintodoey.store

    import android.arch.lifecycle.LiveData

    interface Renderer<T> {
        fun render(model: LiveData<T>)
    }