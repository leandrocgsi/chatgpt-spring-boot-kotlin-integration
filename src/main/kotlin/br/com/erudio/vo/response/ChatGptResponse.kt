package br.com.erudio.vo.response

class ChatGptResponse {
    var choices: List<Choice?>? = null
    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + if (choices == null) 0 else choices.hashCode()
        return result
    }

    override fun equals(obj: Any?): Boolean {
        if (this === obj) return true
        if (obj == null) return false
        if (javaClass != obj.javaClass) return false
        val other = obj as ChatGptResponse
        if (choices == null) {
            if (other.choices != null) return false
        } else if (choices != other.choices) return false
        return true
    }
}