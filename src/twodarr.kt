fun main(){
    var arrlst = arrayListOf<ArrayList<String>>()
    println("Enter three countries following with their capitals")
    for(i in 0..2){
        arrlst.add(arrayListOf("",""))}
    for (i in 0..2){
        print("Country: ")
        arrlst[i][0] = readLine().toString()
        print("Capital: ")
        arrlst[i][1] = readLine().toString()}
    for (i in 0..2){
        print("Country: "+arrlst[i][0]+" ")
        println("Capital: "+arrlst[i][1])}
}