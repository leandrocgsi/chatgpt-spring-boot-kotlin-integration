package br.com.erudio.vo.response

data class ChatGptResponse (

    var choices: List<Choice?>? = mutableListOf()
)
/**
{
    // Getter para a propriedade 'choices'
    fun getChoices(): List<Choice?>? {
        return choices
    }
}*/