package br.com.erudio.vo.response

import br.com.erudio.vo.request.Message

class Choice {
    var index = 0
    var message: Message? = null
    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + index
        result = prime * result + if (message == null) 0 else message.hashCode()
        return result
    }

    override fun equals(obj: Any?): Boolean {
        if (this === obj) return true
        if (obj == null) return false
        if (javaClass != obj.javaClass) return false
        val other = obj as Choice
        if (index != other.index) return false
        if (message == null) {
            if (other.message != null) return false
        } else if (message != other.message) return false
        return true
    }
}