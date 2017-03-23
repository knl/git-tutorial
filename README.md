# Git Tutorial: Git and GitHub for beginners

Tutorial on git and GitHub for beginners, with content being changed on the need
basis.
   
## Step 1: Cloning from a remote server to your local machine 

The process of downloading a repo from a remote server to your local machine is
known as *cloning*.

To clone a repo, first you need to copy the repo's URL as seen below:

<img src="https://cloud.githubusercontent.com/assets/361496/24220082/4c6c6046-0f49-11e7-935f-202a53b4882a.png">

Move to where you want to place the project on your local machine using the
``cd`` (change directory) command. For instance if you have a =projects= folder
in your _home_ folder, you'd do something like: 

    cd ~/projects

When you clone a repo, it downloads a brand new folder which contains all the
files inside of it (so you _don't need to make a specific folder for the project_)

Once you're in the location you want to be, in the terminal, use the command
(notice how the last parameter is the URL from the first step):

    git clone https://github.com/knl/git-tutorial

It should look something like:

    $ git clone https://github.com/knl/git-tutorial
    Cloning into 'git-tutorial'...
    remote: Counting objects: 9, done.
    remote: Compressing objects: 100% (6/6), done.
    remote: Total 9 (delta 1), reused 9 (delta 1), pack-reused 0
    Unpacking objects: 100% (9/9), done.

It may prompt you to log in with your GitHub information.

## Step 2: Checking out the history

Now that you have the project on your local machine, you can look at all the
files and the changes that have been made to it. We usually read more than we
write, so this is a usefull skill to pick up.

### The history of the project.

Using the command `git log` you can see a list of
all the changes made in the project. For instance here is a partial history of the
project up to this point:

    $ git log
    commit e718ce88c711fa734229faeefa559970c875c513
    Author: Donald Duck <donald@duck.com>
    Date:   Wed Mar 22 22:20:35 2017 +0100

        Add king-of-the-hill Hello World (Java!)

    commit b1d3ec1fb971f2bed1dbe7478a86a3c0c08c00df
    Merge: 337b2c8 cd9d69b
    Author: Nikola Knezevic <nikola@knezevic.co>
    Date:   Wed Mar 22 22:31:55 2017 +0100

        Merge branch 'exotic-languages'

    commit cd9d69b5f9e5bf103d24c7649b8b6980a0f616b9
    Author: Nikola Knezevic <nikola@knezevic.co>
    Date:   Fri Mar 17 22:31:44 2017 +0100

        Add LolCat Hello World

    commit 0db55d93d44b056b8d4c3cc0e308715be6c90a56
    Author: Nikola Knezevic <nikola@knezevic.co>
    Date:   Fri Mar 17 22:31:36 2017 +0100

        Add Haskell

    commit 337b2c8cb77506759f84c77d36c9af75365800d3
    Author: Mickey Mouse <mickey.mouse@gfail.com>
    Date:   Wed Mar 15 22:26:23 2017 +0100

        Add c++ hello world

    commit 7bff0121d6496e6d9372f72353efc8b47c0d2612
    Author: Mickey Mouse <mickey.mouse@gfail.com>
    Date:   Wed Mar 15 22:26:09 2017 +0100

        Add scala hello world

This history is unwidely. Try out the following arguments to `git log`:

* `--oneline`
* `--graph`
* `--relative-date`
* `--decorate`
* `--abbrev-commit`

Try out combinations, too.

### Commit limiting

We can also narrow down what we see in the history, as we (definitely) are not
interested in the full history since the inception of the project. The syntax
for commit narrowing is:

    $ git log [<options>] [<revision-range>] [[--] <path>...]

`<revision range>` part tells git for which commits we are interested in
could be a range:

- for example `a315d42..b1d3ec1`, or `b1d3ec1..master`
- or a date: `--since=<date>`, `--after=<date>`, `--until=<date>`, `--before=<date>`
  - tip: "2 weeks ago" is a valid date
- or the author: `--author=<who>`, `--committer=<who>`
- or the text: `--grep=<what>`

Exercise: find all commits containing word "Hello"
Exercise: find all commits containing word "Hello" in the last 2 weeks (or two
months)
Exercise: find all commits done by Donald Duck

### History simplification

If we're interested in getting all commits that acted on a particular file, we
use the following form:

    $ git log [options] [revision range] [[--] path...]

Notice `-- path` path. This tells git to only do `git log`, plus all commit
narrowing and other parameters, but only while looking at commits that affected
`path`.

Here are all commits touching `README.md`, up to this point:

    $ git log --oneline --abbrev-commit -- README.md
    1765591 Add step 2, description of git log command
    eb2de5b Fix dropbox image
    a315d42 Add more clarifications to the first step
    4804a47 Add the first step - Hello World of git
    f7e3c79 Add the initial README.md

Exercise: Try out different combinations of arguments to `git log`. Try out
multiple paths.

### Looking at a single commit

`git log` is nice, but it only shows us the history. Sometimes we want to see
changes made by a particular commit. If that's the case, there is a command for
it:

    $ git show -p <object>...

`<object>` is SHA-1 of the commit, either short or full.

Exercise: see the changes introduced by one of commits containing word "Hello".

## Step 3: Adding a new file
## Step 4: Creating a new commit
## Step 5: Deleting a file
## Step 6: Renaming a file
## Step 7: Creating a branch
## Step 8: Pushing a branch to GitHub
## Step 9: Merging
## Step 10: Basking in your git glory
