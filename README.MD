Instructions assume a Linux system

## Setup
* Ensure latest firefox is installed on your System
* Install SDKMAN using instructions from http://sdkman.io/install.html
* Install Gradle using command "sdk install gradle 2.12"
* Using terminal go to root of this directory and run "gradle idea" and wait till downloads are finished
* Using terminal ho to the directory "src/main/webapp" and run the command "python -m SimpleHTTPServer 2300". This terminal must not be closed
* Run the command "gradle test -Dtest.single=Canary" to ensure that