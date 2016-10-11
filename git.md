git
===

The general strategy for git is: pull, add, commit, push (and repeat)

```
git pull origin master

git status      # show changes

git add fruits.txt
git commit      # brings up your default text editor (usually vim) where you can write your commit message

git add josephus/*.java
git commit -m "adding all the josephus java files"

git push origin master
```

There are other git commands that may be useful to learn

git log

git log --graph --oneline

git diff

git stash
