# TikTok Video Streaming Platform: A Distributed Broker-Client Java Application :iphone: :video_camera: :family:

<br>

## 📢Note📢
🎯Please, clone this repository before reading the description. Don't forget to like👍and share your thoughts😊.

<br>

## About
This project demonstrates a multimedia content-sharing system developed as part of a course assignment, inspired by popular video-sharing platforms like TikTok and Instagram. Built using [#Java 8](https://www.java.com/en/), the system allows users to upload and share videos with their subscribers via a streaming mechanism. The core functionality includes managing user channels, and subscriptions, and streaming video content efficiently to multiple recipients. The system intelligently delivers content to interested subscribers in real time, ensuring seamless video viewing as soon as it becomes available. This project also serves as an introduction to video streaming concepts and Android development. The implementation is divided into two phases, with the first phase (current project) focusing on building the event delivery framework for video streaming. This version of the system supports the operation of three Brokers (servers), and two or more AppNodes (users).

## Execution
Detailed instructions follow that guide the user step-by-step.

1. Run the ```compile.bat``` file by double-clicking on the projects directory. 
1. Double-click the ```runBroker.bat``` file. Repeat the step two more times to create three Brokers in total.
1. Double-click the ```runAppNode.bat``` file. Repeat the step one more time to create two AppNodes in total.

You can now use the application by choosing between 6 different functions for AppNodes, and experiment with operations like uploading videos, adding, removing hashtags, etc.

## Execution Tips
We provide essential tips to ensure a correct and comfortable execution of our application.

### Brokers
When using the application, to avoid possible complications, we suggest the Broker IDs along with their ports be given in increments, like the example shown below.

```
Broker1                           
id: 1				        
ip: localhost
port: 3030                                    

Broker2                           
id: 2				        
ip: localhost
port: 4040 

Broker3                           
id: 3				        
ip: localhost
port: 5050 
```

### AppNodes
We suggest using the project's parent directory to save the videos you want to experiment with. An example follows.

```
-tiktok-java-app
 |_ jars
 |_ src
 |_ info
 |_ .claspath
 |_ .project
 |_ README.md
 |_ video.mp4
 |_ anotherVideo.mp4
```
