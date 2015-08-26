package springone2gx.xmpp

import org.springframework.beans.factory.annotation.Value
import org.springframework.integration.support.MessageBuilder
import org.springframework.integration.xmpp.XmppHeaders
import org.springframework.messaging.Message

class XmppService {
    static transactional = false

    @Value('${springone2gx.xmpp.friend}')
    String friend

    def sendXmppMessagesChannel

    void sendMessage(String msg) {
        println ">> Sending response by XMPP: ${msg}"

        Message<String> message = MessageBuilder.withPayload(msg)
            .setHeader(XmppHeaders.TO, friend)
            .build()

        sendXmppMessagesChannel.send(message)
    }
}
