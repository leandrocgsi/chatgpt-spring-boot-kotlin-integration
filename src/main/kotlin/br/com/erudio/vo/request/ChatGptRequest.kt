package br.com.erudio.vo.request

// data class ChatGptRequest(val prompt: String, val messages: List<Message>)

data class ChatGptRequest(val model: String?, val prompt: String?) {
    val messages: MutableList<Message> = mutableListOf(Message("user", prompt!!))
}

/*    init {
        messages = ArrayList()
        messages.add(Message("user", prompt))
    }*/