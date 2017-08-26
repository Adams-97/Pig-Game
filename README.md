# Pig-Game

This is a Pig dice game that I created using Java.
It works well if you play it on the Eclipse IDE.
The player will be facing against the computer and well be using the Console terminal to player. 
First to 100 points wins!

Rules:
Player can choose to roll 2 dice or hold.

Rolls:
There a 4 conditions
a) If player rolls 2 ones the player loses all their total points.
b) If player rolls 1 one the player ends his turn, and doesn't gain any points.
c) If player rolls the same number in both die, then player has to roll again.
d) If player rolls 2 different valued die that is not a 1. The their current score is raised. 
At this point players may choose 'hold' or roll again to get more points.

Hold:
If the player chooses to hold, all of the points rolled during that turn are added to their total score.

Scoring Examples:
Example 1: 
Jasmine rolls a TWO and a FOUR = SIX and decides to continue. 
She then chooses to roll three more times (6, 9, 1). 
Because she rolled a 1, Sherri's turn ends and she earns 0 points.

Example 2: 
Heywood rolls a FIVE and a TWO and decides to continue. 
He then chooses to roll four more times (7, 3, 5, 6) and decides to hold. 
Craig earns 21 points for this turn (7+3+5+6=21).


Gameplay:
Jasmine and Heywood will keep alternating turns until the someone reaches 100 points

