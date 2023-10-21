package br.com.erudio.vo.request

class Message {
    var role: String? = null
    var content: String? = null //prompt

    constructor(role: String?, content: String?) {
        this.role = role
        this.content = content
    }
}