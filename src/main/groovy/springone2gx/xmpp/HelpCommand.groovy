package springone2gx.xmpp

class HelpCommand implements XmppCommand {

    String execute() {
        return """
        Commands available:
          stock QUOTE1 QUOTE2 ... QUOTEN
          weather CITY

        Example:
          stock GOOG AAPL YHOO
          weather london
        """
    }
}
