package com.nxt.chatbot.data

data class Message(val message: String, val id: String, val time: String) {
    constructor() : this("", "", "")
}
