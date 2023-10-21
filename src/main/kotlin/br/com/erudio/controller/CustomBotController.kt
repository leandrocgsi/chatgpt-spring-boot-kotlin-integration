package br.com.erudio.controller

import br.com.erudio.service.ChatGptService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/bot")
class CustomBotController {
    @Autowired
    private val service: ChatGptService? = null
    @GetMapping("/chat")
    fun chat(@RequestParam("prompt") prompt: String?): String? {
        return service!!.chat(prompt)
    }
}
