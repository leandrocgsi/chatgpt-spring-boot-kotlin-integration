package br.com.erudio.service

import br.com.erudio.vo.request.ChatGptRequest
import br.com.erudio.vo.response.ChatGptResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.util.logging.Logger

@Service
class ChatGptService {
    private val logger = Logger.getLogger(ChatGptService::class.java.getName())

    @Value("\${openai.model}")
    private val model: String? = null

    @Value("\${openai.api.url}")
    private val apiURL: String? = null

    @Autowired
    private val template: RestTemplate? = null
    fun chat(prompt: String?): String? {
        logger.info("Starting Prompt")
        val request = ChatGptRequest(model, prompt)
        val response = template!!.postForObject(apiURL!!, request, ChatGptResponse::class.java)
        logger.info("Proccessing Response")
        return response.getChoices()[0].message.content
    }
}
