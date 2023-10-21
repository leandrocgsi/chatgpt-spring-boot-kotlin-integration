package br.com.erudio.vo.request

class ChatGptRequest(var model: String?, prompt: String?) {

    private val messages: MutableList<Message>?

    init {
        messages = ArrayList()
        messages.add(Message("user", prompt))
    }
}
