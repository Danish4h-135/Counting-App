package com.apps.counterview

data class CounterModel(var count: Int)

class CounterRepo{
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun incrementCounter(){
        _counter.count++
    }

    fun decrementCounter(){
        _counter.count--
    }
}