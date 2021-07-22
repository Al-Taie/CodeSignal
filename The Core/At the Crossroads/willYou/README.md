<a href="https://www.instagram.com/9_Tay"><img src="https://img.shields.io/badge/instagram-%23E4415F?style=flat&logo=instagram&logoColor=white"/></a>

**Once Mary heard a famous song, and a line from it stuck in her head. That line was "Will you still love me when I'm no longer young and beautiful?". Mary believes that a person is loved if and only if he/she is both young and beautiful, but this is quite a depressing thought, so she wants to put her belief to the test.**

**Knowing whether a person is young, beautiful and loved, find out if they contradict Mary's belief.**

**A person contradicts Mary's belief if one of the following statements is true:**

* they are young and beautiful but not loved
* they are loved but not young or not beautiful

### Example

For:

```
[1] young = true, beautiful = true, and loved = true
[2] young = true, beautiful = false, and loved = true
```

the output should be:

```
[1] willYou(young, beautiful, loved) = false
```
Young and beautiful people are loved according to Mary's belief.

```
[2] willYou(young, beautiful, loved) = true.
```
Mary doesn't believe that not beautiful people can be loved.

### Input/Output

* [input] boolean young
* [input] boolean beautiful
* [input] boolean loved
* [output] boolean

`true` if the person contradicts Mary's belief, `false` otherwise.

[follow me on instagram](https://www.instagram.com/9_tay)