package lauks.sebastian.sm_p2.viewmodel

import androidx.lifecycle.ViewModel
import lauks.sebastian.sm_p2.data.Game
import lauks.sebastian.sm_p2.data.Sign
import lauks.sebastian.sm_p2.repository.GameRepository

class GameViewModel: ViewModel() {
    private val gameRepository = GameRepository.getInstance()

    fun getBoard() = gameRepository.getBoard()
    fun saveBoard(board: MutableList<MutableList<Sign>>) = gameRepository.saveBoard(board)

    fun getGame() = gameRepository.getGame()
    fun saveGame(game: Game) =  gameRepository.saveGame(game)
}