    package com.example.zver.kotlintodoey.store

    import android.arch.core.util.Function
    import com.example.zver.kotlintodoey.model.Action

    interface Store<T> {
        fun dispatch(action: Action)

        fun subscribe(renderer: Renderer<T>, func: Function<T, T> = Function { it })
    }