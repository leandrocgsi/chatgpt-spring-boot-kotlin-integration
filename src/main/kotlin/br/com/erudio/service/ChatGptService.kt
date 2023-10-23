package br.com.erudio.service

import br.com.erudio.vo.request.ChatGptRequest
import br.com.erudio.vo.request.Message
import br.com.erudio.vo.response.ChatGptResponse
import kotlinx.serialization.json.Json
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
    private lateinit var template: RestTemplate
    fun chat(prompt: String?): String? {

        logger.info("Starting Prompt")

        // var messages: List<Message> = ArrayList

        val messages = arrayListOf<List<Message>>()
        val message = Message("user", prompt!!)
        messages.add(listOf(message))
        val request = ChatGptRequest(model!!, messages)

        val jsonString = Json.encodeToString(ChatGptRequest.serializer(), request)

        // Imprimindo no console
        println(jsonString)

        val response = template.postForObject(apiURL!!, request, ChatGptResponse::class.java)

        logger.info("Proccessing Response")

        return response?.getMyChoices()?.get(0)?.message?.content
    }
}
