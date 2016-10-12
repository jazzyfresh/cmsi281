git
===

The general strategy for git is: pull, add, commit, push (and repeat)

```
git pull origin master     # brings changes in from the remote repository called "origin"

# make code changes

git status                 # show changes

git add fruits.txt         # stage fruits.txt - tells git you are ready to commit this change
git commit                 # brings up your default text editor (usually vim) where you can 
                           # write your commit message

git add josephus/*.java    # stage all the java files in josephus
git commit -m "adding all the josephus java files"      # commit with an inline message

git push origin master     # send your changes to the remote repo "origin"
```

There are other git commands that may be useful to learn

git log

git log --graph --oneline

git diff

git stash


