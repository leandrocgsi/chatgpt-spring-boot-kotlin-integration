package br.com.erudio.vo.request

class ChatGptRequest(var model: String?, prompt: String?) {
    private var messages: MutableList<Message>?

    init {
        messages = ArrayList()
        messages.add(Message("user", prompt))
    }

    fun getMessages(): List<Message>? {
        return messages
    }

    fun setMessages(messages: MutableList<Message>?) {
        this.messages = messages
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + if (messages == null) 0 else messages.hashCode()
        result = prime * result + if (model == null) 0 else model.hashCode()
        return result
    }

    override fun equals(obj: Any?): Boolean {
        if (this === obj) return true
        if (obj == null) return false
        if (javaClass != obj.javaClass) return false
        val other = obj as ChatGptRequest
        if (messages == null) {
            if (other.messages != null) return false
        } else if (messages != other.messages) return false
        if (model == null) {
            if (other.model != null) return false
        } else if (model != other.model) return false
        return true
    }
}
