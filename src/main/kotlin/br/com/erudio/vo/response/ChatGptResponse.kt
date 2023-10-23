package br.com.erudio.vo.response

data class ChatGptResponse (

    var choices: List<Choice?>? = mutableListOf()
)
{
    fun getMyChoices(): List<Choice?>? = choices
    // Expression body
}