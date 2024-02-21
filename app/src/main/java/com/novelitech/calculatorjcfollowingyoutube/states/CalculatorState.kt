package com.novelitech.calculatorjcfollowingyoutube.states

import com.novelitech.calculatorjcfollowingyoutube.utils.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null,
)
