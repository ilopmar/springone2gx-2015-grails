package springone2gx.xmpp

import groovy.transform.TupleConstructor

@TupleConstructor
class StockCommand implements XmppCommand {
    List<String> quotes

    String execute() {
        String formatedQuotes = this.quotes.join('+')

        URL url = "http://finance.yahoo.com/d/quotes.csv?s=${formatedQuotes}&f=l1s".toURL()
        String content = url.getText("UTF-8")

        def stockPrices = content.readLines().collect { line ->
            def rawData = line.split(",")

            String price = rawData[0]
            String quote = rawData[1]

            return "\nPrice for ${quote} is ${price}"
        }

        return stockPrices.join("")
    }
}