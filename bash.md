bash
====

Navigating the file system
--------------------------

###pwd - print working directory, prints the directory you're currently in

###cd - change directory, or navigate to another "folder"

```
cd ~          # navigate to the home directory, which is the same as your user directory
cd jazzyfresh-cmsi281              # cd into the jazzyfresh-cmsi281 repo
```

###ls - list the contents of a directory

```
ls ~        # show the contents of the home directory, which is the same as your user directory
ls jazzyfresh-cmsi281                   # show the contents of the directory jazzyfresh-cmsi281
ls           # show the contents of the current working directory
ls -l        # show the contents of the current working direcotry in list format
ls -a        # show all the contents of the current working directory, even secret files that begin with a .
ls -la       # show all the contents of the current working directory, even secret files that begin with a .
             # AND show it in list format, because you can combine the "flags" or option parameters after one dash
```


Doing stuff with files
----------------------

###cp - copies files from a source to a destination

```
cp file.txt ../
cp jazzyfresh-cmsi281/josephus/*.java cmsi281-solutions/
```


###mv - move or rename files and directories


###vim - a text editor [vim-adventures.com](http://vim-adventures.com/)






Advanced
========




Looking at files, searching, parsing
------------------------------------

###find

###grep

###sed, awk

###jq

###perl


managing software
-----------------

###which

###brew (mac only)

###apt-get install (linux only)
