Extra Practice - Jan 30
==============

Once you have successfully completed and submitted your lab assignment due on Jan 30 you should begin work on your [Project](https://github.com/CS212-S15/projects/blob/master/specifications/project1.md).

First, clone your `<username>-project` repository from Github.

Second, read carefully through the [project description](https://github.com/CS212-S15/projects/blob/master/specifications/project1.md). You are not expected to understand everything yet, but it will give you an idea of the goal of this project.

I have provided you with a very specific API that you must implement *exactly* for this project, and we'll be covering relevant material about data structures, JSON, and many other topics before your project is due.

I recommend you begin by thinking through your implementation of the `InvertedIndexBuilder`. This class will need to be passed a directory and a boolean to represent whether digits should be used as part of the delimiter. In my solution, I pass this information into the constructor and store it in appropriate data members.

The class should have a method that will *recursively* traverse the directory and read in all of the words of each file. Eventually, you will need to add each word and its location to the `InvertedIndex`. For now, simply count the number of words in each file. In my solution, I use three methods to accomplish this: a recursive method, a helper method, and a method that parses a file.
