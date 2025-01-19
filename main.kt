// i:                0    1    2    3    4    5   6    7    8
val board = arrayOf("0", "0", "0", "0", "0", "0","0", "0", "0")
val playerX = "X"
val playerO = "O"
var victory: Boolean = false 

fun divider() = println("                      ")

fun showTab(){
    println(board[0] + " | " + board[1] + " | " + board[2])
    println("--+---+--")
    println(board[3] + " | " + board[4] + " | " + board[5])
    println("--+---+--")
    println(board[6] + " | " + board[7] + " | " + board[8])
    divider()
}

fun moveValid(move: Int):Boolean{
    if (move-1 <0 || move-1 >8){
        println("Invalid move. Try again:")
        return false
    }
    if (board[move-1] !== "0"){
        println("Invalid move. Try again:")
        return false
    }
    return true
}

fun playerMove(player:String, move:Int) {
    board[move-1] = player
}

fun main(){
    var move:Int
    println("Bem vindo ao jogo da velha")
    showTab()
    while (victory == false){
    //Player X
        println("Jogada do jogador X:")
        do {
            move = readLine()!!.toInt()
        }while (moveValid(move) == false)
        playerMove(playerX, move)
        showTab()
    //Player 0
        println("Jogada do jogador O:")
        do {
            move = readLine()!!.toInt()
        }while (moveValid(move) == false)
        playerMove(playerO, move)
        showTab()
    }
}