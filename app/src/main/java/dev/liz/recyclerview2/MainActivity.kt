package dev.liz.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.liz.recyclerview2.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numbersList=numbers(100)
        print(numbersList)
        binding.rvNumbers.adapter=NumbersRecyclerViewAdapter(numbersList)
        binding.rvNumbers.layoutManager= LinearLayoutManager(this)
    }
    fun numbers(size:Int): MutableList<BigInteger>{
        var listnum= mutableListOf(BigInteger.ZERO,BigInteger.ONE)
        while (listnum.size<size) {
            var last=listnum.get(listnum.lastIndex)
            var seconlst=listnum.get(listnum.lastIndex-1)
            var next=last+seconlst
            listnum.add(next)
        }
//        var num1=1
//        var num2=0
//        var m=0
//        while (m<=size){
//            print(num1)
//            var sum=num1+num2
//            num1=num2
//            num2=sum
//            m++
//            listnum+=sum
        println(listnum.size)
        println(listnum)
        return listnum
        }

    }
