package com.example.scramblegame.ui


data class GameUiState(
    val currentScrambleWord: String = "",
    val isGuessedWordWrong: Boolean = false,
)
