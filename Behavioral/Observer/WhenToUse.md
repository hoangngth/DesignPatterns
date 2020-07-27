1. When you need many other objects to receive an update when another object changes.
    - Stock market with thousands of stocks needs to send updates to objects representing individual stocks.
    - The Subject (publisher) sends many stocks to the Observers.
    - The Observers (Subscribers) take the ones they want and use them.