package br.com.erudio.vo.request

class Message {
    var role: String? = null
    var content: String? = null //prompt

    constructor()
    constructor(role: String?, content: String?) {
        this.role = role
        this.content = content
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + if (content == null) 0 else content.hashCode()
        result = prime * result + if (role == null) 0 else role.hashCode()
        return result
    }

    override fun equals(obj: Any?): Boolean {
        if (this === obj) return true
        if (obj == null) return false
        if (javaClass != obj.javaClass) return false
        val other = obj as Message
        if (content == null) {
            if (other.content != null) return false
        } else if (content != other.content) return false
        if (role == null) {
            if (other.role != null) return false
        } else if (role != other.role) return false
        return true
    }
}