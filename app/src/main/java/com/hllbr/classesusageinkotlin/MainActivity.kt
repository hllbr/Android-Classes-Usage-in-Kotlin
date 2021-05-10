package com.hllbr.classesusageinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Kotlinde sınıfların kullanımları =
        Sınıf örnek vermek gerekirse MainActivity bir sınıftır içerisinde Fonksiyonları değişkenleri özellikleri bulunduran Büyük bir yapı olarak tarif edebiliriz.
        kerdim için sınıflar oluşturabilir ve bunlardan objeler türetebilirim.
          Class ==
         */
        val homorName :String =  "Homer Simpson"
        val homorJob  : String = "Nuclear"
        val homerAge : Int = 50

        val bartName :String = "Bart"
        //Burada tek tek oluşturmak zaman ve efor kaybıne neden oluyor bu işlem içni bir sınıf(model oluşturabilirim)
        //Tüm oluşturmak istediğim Simpsonları bir model/Şablon üzerinden üretebilirim

        //Simspson sınıfından obje oluşturmak =
        val homer1 = Simspons()//Obje oluşturuldu fakat hiçbir değeri yok
        //Object = Instance oluşturduğum homer1 Simspson sınıfından bir obje(Boş bir obje)
        homer1.age = 50
        homer1.job = "Nuclear"
        homer1.name = "Homer Simpson"

        println(homer1.age)
        println(homer1.job)
        println(homer1.name)//Kendi sınıfını oluşturmak ve bu sınıftan obje oluşturmak bu kadar

    }


}