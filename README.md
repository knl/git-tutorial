# Git Tutorial: Git and GitHub for beginners

Tutorial on git and GitHub for beginners, with content being changed on the need
basis.
   
## Step 1: Cloning from a remote server to your local machine 

The process of downloading a repo from a remote server to your local machine is
known as *cloning*.

To clone a repo, first you need to copy the repo's URL as seen below:

<img src="https://www.dropbox.com/s/oit0qdyvsnvf45a/cloning.png?dl=0">

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
## Step 3: Adding a new file
## Step 4: Creating a new commit
## Step 5: Deleting a file
## Step 6: Renaming a file
## Step 7: Creating a branch
## Step 8: Pushing a branch to GitHub
## Step 9: Merging
## Step 10: Basking in your git glory