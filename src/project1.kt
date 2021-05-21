fun main() {
    var muziki=Guitar("Acoustic","Yamaha","one year","G","Worship song","wait on you")

    muziki.play()
    println(muziki.chord)
    muziki.string(5)
    println(muziki.chord)
    println(muziki.typesong)
    muziki.song()
    println(muziki.song)
    muziki.chorus()
    println(bake("chololote","eggs,flour,baking powder,juice","round","3kgs"))
    println(bake("banana","flour,milk,whipping cream,banana slices,baking powder","oval","4kgs"))




}
class Guitar(var make:String,var model:String,var warranty:String,var chord:String,var typesong:String,var song:String) {
    fun play() {
        println("I am playing acoustic guitar chord G string 5")
    }

    fun string(string: Int): Int {
        chord = chord + string
        return string

    }
    fun typesong(string: Int):Int{
        typesong=typesong+string
        return string

    }
    fun song(){

    }
    fun chorus(){
        println("Wait on the lord")
        println("He will renew your strength")
        println("So wait i say")
    }

}
data class bake(val type:String,val mixture:String,val shape:String,val kilos:String){
    fun thecake(cake:bake){
        val cakes = listOf( "chocolate","banana")

    }



}


