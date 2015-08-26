package springone2gx.xmpp

class XmppController {

    def xmppService

    def chat(String msg) {
        msg = msg ?: 'Hello SpringOne 2GX from Spring Integration XMPP!'

        xmppService.sendMessage(msg)

        render 'Done!'
    }
}
