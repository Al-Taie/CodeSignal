<a href="https://www.instagram.com/9_Tay"><img src="https://img.shields.io/badge/instagram-%23E4415F?style=flat&logo=instagram&logoColor=white"/></a>

**Consider an arithmetic expression of the form `a#b=c`. Check whether it is possible to replace `#` with one of the four signs: `+, -, *` or `/` to obtain a correct expression.**
### Example

For:

```
[1] a = 2, b = 3, and c = 5
[2] a = 8, b = 2, and c = 4
[3] a = 8, b = 3, and c = 2
```

the output should be:

```
[1] arithmeticExpression(a, b, c) = true
```
We can replace `#` with `a +` to obtain `2 + 3 = 5`, so the answer is `true`

```
[2] arithmeticExpression(a, b, c) = true
```
We can replace `#` with `a /` to obtain `8 / 2 = 4`, so the answer is `true`

```
[3] arithmeticExpression(a, b, c) = false
```
* `8 + 3 = 11 ≠ 2`
* `8 - 3 = 5 ≠ 2`
* `8 * 3 = 24 ≠ 2`
* `8 / 3 = 2.(6) ≠ 2`

[follow me on instagram](https://www.instagram.com/9_tay)