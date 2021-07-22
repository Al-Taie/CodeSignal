<a href="https://www.instagram.com/9_Tay"><img src="https://img.shields.io/badge/instagram-%23E4415F?style=flat&logo=instagram&logoColor=white"/></a>

**In tennis, the winner of a set is based on how many games each player wins. The first player to win `6` games is declared the winner unless their opponent had already won `5` games, in which case the set continues until one of the players has won 7 games.**

**Given two integers `score1` and `score2`, your task is to determine if it is possible for a tennis set to be finished with a final score of `score1` : `score2`.**
### Example

For:

```
[1] score1 = 3 and score2 = 6
[2] score1 = 8 and score2 = 5
[3] score1 = 6 and score2 = 5
```

the output should be:

```
[1] tennisSet(score1, score2) = true
```
Since player `1` hadn't reached `5` wins, the set ends once player `2` has won `6` games.

```
[2] tennisSet(score1, score2) = false
```
Since both players won at least `5` games, the set would've ended once one of them won the `7th` one.

```
[3] tennisSet(score1, score2) = false
```
This set will continue until one of these players wins their `7th` game, so this can't be the final score.

[follow me on instagram](https://www.instagram.com/9_tay)