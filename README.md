# Magical-Series-Game
Write an object-oriented Java program for the game Magical Series.   Magical Series is a card game played by two players: user1 and user2.   The game is played with a deck of cards. The deck has 52 cards including hearts, diamonds, spades and clubs suits and each suit has A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K. The players will try to win the game by turning over the face-down cards and expanding the series. 

Start of the Game

The cards are shuffled and laid out face down at random positions on a QUEUE.
For example: 
Queue: H5 CA SA S10 D5 DJ D3 S3 D6 HK DQ DA S8 C7 C5 H4 S9 ... C2 

The game is played in series of randomly turning over cards. A series starts by turning over a card. If the last opened card and the previous one are of the same suit or rank, there is a relation. 

As long as there is a relation between the last two cards, the player can continue to turn over cards. The turned over cards should be stored in a STACK. 

If there is no relation between the last two cards, the player gets the points of the series and the game turns to the other player.  

Always the user1 starts the game. 


Calculating the Points of a Series

The points of a series in the stack should be calculated as follows: 
- Same suit: 1 point
- Same rank: 3 points

Example: 
Stack: H5 D5 D8 D3 S3 D6

Relations and points:
H5-D5 : 3 points
D5-D8 : 1 point
D8-D3 : 1 point
D3-S3 : 3 points
S3-D6 : 0 point

Points of the series = 3 + 1 + 1 + 3 + 0 = 8 points


End of the Game 

All the turned over cards are removed from the queue. 

The game finishes when a player reaches at least 10 points or all the cards are turned over. If all the cards are turned over, the points of the current series are added to his/her score.

The winner is the player who gets more points. If the points of the players are equal, then the game is a draw.

The program must display all steps until the game is over. 


Object-Oriented Programming

Create the classes for object-oriented programming such as: 
- Class Card      (rand, suit, etc)
- Class User      (name-surname, birthdate, gender, contact address, phone number, etc.)
- Class Date
- Class Address 
- Class Phone
- etc.  

Assign some values to the users in the code in the main program.
For example; “Deniz Tarak”, 27.04.1980, female, “DEU Kız Yurdu Buca Izmir Türkiye”, +90 232 1234567 


