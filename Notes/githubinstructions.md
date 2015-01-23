Github Instructions
===================
# Table of Contents
1. [Setup](#setup)
2. [Initial Clone](#Initial Clone)

##Setup
1. Make sure you are using Eclipse Luna and that it is configured to use Java 8.
  1. Download [Eclipse here](https://eclipse.org/)
  2. Download [Java 8 here](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
  3. Make sure that Eclipse is configured correctly. `Eclipse->Preferences->Java->Compiler` should show a "Compiler compliance level" of 1.8 and `Installed JREs` should show Java SE 8. See the professor TA if you need help with this.
2. Install either [Github for Mac](https://mac.github.com/) or [Github for Windows](https://windows.github.com/). If you are a Linux user, feel free to use the command line. There are lots of other equivalent tools, but we'll help you out with these. Eclipse also has some integrated support, but you will need to do a few things that aren't easy to do with Eclipse directly. Get used to the command line or a separate tool.

##Initial Clone
The instructor will create for you private repositories for all fo the work you will submit in this class. You should *always* first `clone` or `pull` (that is `update` in SVN terms) the appropriate repository before beginning work. In addition, if the instructor has reviewed your code you must make sure to `pull` any comments or changes *before you make changes*. If you do not, this will lead to unending headache (trust me on this one!).

Your repository names will use the following naming convention: `<github_username>-<repository_name>`, for example `srollins-homework` or `srollins-project`. Your `homework` repository will contain several Eclipse projects and more projects will be added throughout the semester. 

###Using the Github Tool
1. Make sure you have signed in to your github account.
2. Choose `File->Clone Repository`. This will show you a list of all repositories you have available.
3. Choose the appropriate repository, for example `CS212-S15/srollins-homework`, and then select the local directory where you'd like to save the data, for example `/Users/srollins/cs212`.
4. Once you click `Clone` the data will be downloaded and you should be able to use `Finder` or `Explorer` to see it. The Github tool will show you *only* the files that have been changed locally and not pushed to Github. It will not list all files.

##Loading into Eclipse
1. Open Eclipse specifying the local directory indicated in step 3 under Using the Github Tool (e.g., `/Users/srollins/cs212`).
2. Right-click under the `Package Explorer` and select `Import`.
3. Choose `General->Existing Projects into Workspace`.
4. Select the root directory as the directory created by the Github tool (e.g., `/Users/srollins/cs212/srollins-homework`).
5. Select all of the projects you wish to import and click `Finish`.