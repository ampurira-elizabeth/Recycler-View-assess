package dev.liz.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.liz.recyclerview2.databinding.ActivityMainBinding

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
    fun numbers(size:Int):List<Int>{
        var listnum=ArrayList<Int>()
         var num1=1
        var num2=0
        var m=0
        while (m<=size){
            print(num1)
            var sum=num1+num2
            num1=num2
            num2=sum
            m++
            listnum+=sum
        }
        return listnum
    }
}